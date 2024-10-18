package dowhile;

import java.util.Scanner;

public class NesteddowhileFactorial 
{
	public static void findFactorial()
	{
		Scanner sobj = new Scanner(System.in);
		char ch = ' ';
		
		do
		{
			int iFact = 1,iCnt = 1;
			
			System.out.println("Enter the number:");
			int iNo = sobj.nextInt();
			do
			{
				iFact = iFact * iCnt;
				iCnt++;
			}
			while(iCnt <= iNo);
			System.out.println("Factorial is: "+iFact);
			System.out.println("Do you want to continue (Y/N)");
			ch = sobj.next().charAt(0);
		}
		while(ch == 'Y' || ch == 'y');
		System.out.println("End of the program..");
		
	}

	public static void main(String[] args) 
	{
		findFactorial();

	}

}
