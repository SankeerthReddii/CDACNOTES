class CheckPrime{
   public static boolean isPrime(int num){
      for(int i=2;i<num;i++){
	     if(num%i==0)
		    return false;
		     
	  }
	  //the number is prime
      return true;
   }
   public static void main(String[] args){
      if(args.length==1){
	     boolean flag=isPrime(Integer.parseInt(args[0]));
		 if(flag)  //flag==true
		    System.out.println("Number is prime"+args[0]);
		 else
			System.out.println("Number is not prime"+args[0]);
	  }else{
	     System.out.println("Too few parameters");
	  }
   }
}