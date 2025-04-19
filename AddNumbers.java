import java.util.Scanner;

class AddNumbers{
    public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number");
	  int num1=sc.nextInt();
	  System.out.println("Enter number");
	  int num2=sc.nextInt();
	  System.out.println("Addition: "+(num1+num2));
	}
}