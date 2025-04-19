import java.util.Scanner;
class MaxNumbers{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter number");
	  int num1=sc.nextInt();
	  System.out.println("enter number");
	  int num2=sc.nextInt();
	  if(num1>num2){
	     System.out.println("Max number : "+num1);
	  }
	  else{
	    System.out.println("Max number : "+num2); 
	  }
   }
}