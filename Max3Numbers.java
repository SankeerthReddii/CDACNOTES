import java.util.Scanner;
class Max3Numbers{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter number");
	  int num1=sc.nextInt();
	  System.out.println("enter number");
	  int num2=sc.nextInt();
	  System.out.println("enter number");
	  int num3=sc.nextInt();
	  if((num1>num2) && (num1>num3)){
	     System.out.println("Max number : "+num1);
	  }
	  else if((num2>num1) && (num2>num3)){
	    System.out.println("Max number : "+num2); 
	  }else{
	    System.out.println("Max number : "+num3);
	  }
   }
}