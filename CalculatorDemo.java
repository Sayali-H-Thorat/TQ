package dowhile;

import java.util.Scanner;

public class CalculatorDemo 
{
	public static void calculator()
	{
		 Scanner sobj = new Scanner(System.in);
		 char ch = ' ';
		 
		 do
		 {
			 System.out.println("Enter the first number:");
			 int iNo1 = sobj.nextInt();
			 
			 System.out.println("Enter the second number:");
			 int iNo2 = sobj.nextInt();
			 
			 System.out.println(" 1. Addition");
			 System.out.println(" 2. Substraction");
			 System.out.println(" 3. Division");
			 System.out.println(" 4. Multiplication");
			 System.out.println(" 5.Exit");
			 
			 System.out.println("Please enter your choice: ");
			 int op = sobj.nextInt();
			 
			 int iResult = 0;
			 
			 switch(op)
			 {
			 case 1:
				    iResult = iNo1+iNo2;
				    break;
			 case 2:
				   iResult = iNo1 - iNo2;
				   break;
			 case 3:
				   iResult = iNo1/iNo2;
				   break;
			 case 4:
				   iResult = iNo1*iNo2;
				   break;
//			 case 5:
//				   System.exit(0);
			default:
				   System.out.println("Wrong input..");
			 }
			 System.out.println(iResult);
			 System.out.println("Do you want to continue (Y/N)");
			 ch = sobj.next().charAt(0);
		 
		 }
		 while(ch=='Y'|| ch=='y');
		 
		 System.out.println("Thank you. Visit Again!!");
		 
	}

	public static void main(String[] args) 
	{
		calculator();

	}

}
