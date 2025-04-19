class AddCMDNumbers{
   public static void main(String[] args){
       int sum=0;
      if(args.length>0){
		  System.out.println("Length : "+args.length);
	      for(int i=0;i<args.length;i++){
		     sum=sum+Integer.parseInt(args[i]);
		  }
		  System.out.println("Addition : "+sum);
	  }else{
	    System.out.println("Too few parameters");
	  }
   }
}