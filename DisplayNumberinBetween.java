package SwitchCaseDemo;

import java.util.Scanner;

public class DisplayNumberinBetween 
{

	public static void numberinBetween(int No)
	{
		switch(No)
		{
		case 10:
			    System.out.println("10");
			    break;
		case 20:
			   System.out.println("20");
			   break;
		case 30:
			   System.out.println("30");
			   break;
		default:
			   System.out.println("Number is not in 10,20 and 30.");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iNo =sobj.nextInt();
		
		numberinBetween(iNo);
		

	}

}
