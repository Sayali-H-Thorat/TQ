package SwitchCaseDemo;

import java.util.Scanner;

public class Calculator 
{
	public static void calculate(int No1,int No2,String operation)
	{
		int iResult = 0;
		switch(operation)
		{
		case "Add":
				  iResult = No1+No2;
			      System.out.println("Addition is: "+iResult);
			      break;
		case "Sub":
			       iResult = No1-No2;
			       System.out.println("Substraction is: "+iResult);
			       break;
		case "Div":
			        iResult = No1/No2;
			 		System.out.println("Division is: "+iResult);
			 		break;
		case "Mult":
					iResult = No1*No2;
					System.out.println("Multiplication is: "+iResult);
					break;
				
		 default:
			    System.out.println("Wrong input..");
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int No1 = sobj.nextInt();
		
		System.out.println("Enter the second number:");
		int No2 = sobj.nextInt();
		
		System.out.println("Enter any operation Add, Sub,Div:");
		String operator = sobj.next();
		
		calculate(No1,No2,operator);
		
	}

}
