package Assignment1;

import java.util.Scanner;

//Find sum of all digits of a number

public class Ass1_Q10 
{
	
	public static int sumDigits(int No)
	{
		int iDigit = 0,iSum = 0;
		
		while(No != 0)
		{
			iDigit = No %10;
			iSum = iSum + iDigit;
			No = No /10;
		}		
		return iSum;
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iNo = sobj.nextInt();
		
		int iRet = sumDigits(iNo);
		
		System.out.println("Sum of digits of number "+iNo+" is: "+iRet);
		
		sobj.close();

	}

}
