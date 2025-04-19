//to find factorial of a number
class FindFactorial{
  //calculate factorial
  public int factorial(int n){
	  
	    int fact=1;
		
		for(int i=1;i<=n;i++){
		    fact= fact*i;  //1*1*2*3*4*5
		}
		return fact;
  }
  public static void main(String[] args){
      if(args.length==1){
		//FindFactorial f=new FindFactorial(); 
	    int fact=factorial(Integer.parseInt(args[0]));
		System.out.println("Factorial: "+fact);
	  }else{
	    System.out.println("Too few parameters");
	  }
  }
}