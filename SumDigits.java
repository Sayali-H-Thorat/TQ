package com.methodwriting;

import java.util.Scanner;

//Sum of digits from number

public class SumDigits 
{
	
	public static int findSum(int No)
	{
		int iSum = 0,iDigit = 0;
		
		while(No !=0)
		{
			iDigit = No %10;
			iSum = iSum+iDigit;
			No = No/10;
		}
		return iSum;
	}
	
	public static int maxDigit(int No)
	{
		int iMax =0,iDigit = 0;
		
		while(No != 0)
		{
			iDigit = No %10;
			if(iDigit > iMax)
			{
				iMax=iDigit;
			}
			No = No / 10;				
		}
		
		return iMax;
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iNo = sobj.nextInt();
		
		int Sum = findSum(iNo);
		
		System.out.println("Sum of Digits is:"+Sum);
		
		int Max = maxDigit(iNo);
		System.out.println("Maximum Digit is:"+Max);
		
		sobj.close();
	}

}
