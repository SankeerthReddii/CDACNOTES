/* drop procedure if exists prod1;
delimiter $
create procedure prod1()
begin
	select 'Hello World' AS "Message";
end $
delimiter ;

drop procedure if exists pro2;
delimiter $
create procedure pro2(in x int, in y int, out z int)
begin
	set z:=x/y;
end $
delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
begin
	if x >100 THEN
		select 'Good';
	ELSE
		select "Bad";
	end if;
end $
delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1()
begin
	declare cnt int default 0;
	
	lbl1:LOOP
		set cnt := cnt + 1;
		if cnt > 5 THEN
			leave lbl1;
		end if;
		select cnt;
	end loop lbl1;
end $
delimiter ;

drop procedure if exists pro1;
delimiter $ 
create procedure pro1(x varchar(30))
begin
	declare cnt int default 0;
	
	lp1:LOOP
		set cnt := cnt+1;
		if cnt>length(x) THEN 
			LEAVE lp1;
		end if;
		select(UPPER(substr(x,cnt,1))) AS "Letter", cnt AS "count";
	end LOOP lp1;
end $
delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int, in y varchar(20))
begin
	insert into d values(x, upper(y));
end $
delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1( in PRN int, in COURSE varchar(25), in NAME varchar(30))
begin
	if COURSE='dac' THEN
		insert into abc values(PRN, UPPER(COURSE), UPPER(NAME));
	else 
		select "SORRY!! Invalid Information";
	end if;
end $
delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1(in a int)
begin
	declare flag boolean default false;
	select true into flag from emp where empno=a;
	if flag then
		select empno, ename, job,sal from emp where empno = a;
	else
		select "Employee not found...";
	end if;
end $
delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
begin
	
	if (select distinct true from emp where mgr=x) then
		select empno, ename, job,sal from emp where mgr = x;
	else
		select "Manager not found...";
	end if;
end $
delimiter ; */


drop procedure if exists pro1;
delimiter $
create procedure pro1(in x varchar(64))
begin
	set @a := concat('select * from ', x);
	prepare y from @a;
	execute y;
end $
delimiter ;