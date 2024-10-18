package SwitchCaseDemo;

import java.util.Scanner;

public class DaysinMonth 
{
	public static void daysinmonth(int month)
	{
		switch(month)
		{
		case 1,3,5,7,8,10,12:
			   				System.out.println("31 days in month");
			   				break;
		case 2:
			   System.out.println("28 or 29 days in February month");
			   break;
		case 4,6,9,11:
					System.out.println("31 days in month");
					break;
		default:
				System.out.println("Entered wrong input..");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the month to check days:");
		int month = sobj.nextInt();
		
		daysinmonth(month);
		
		sobj.close();

	}

}
