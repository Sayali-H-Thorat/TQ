package com.methodwriting;

import java.util.Scanner;

public class PallindromeNumber 
{
	public static boolean isPallindrome(int No)
	{
		int iDigit =0,iRev =0,iTemp =No;
		
		while(No != 0)
		{
			iDigit = No %10;
			iRev =( iRev*10)+iDigit;
			No = No /10;
		}
		
		if(iRev == iTemp)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		boolean bRet=false;
		
		System.out.println("Enter the number:");
		int iNo =sobj.nextInt();
		
		bRet = isPallindrome(iNo);
		
		if(bRet == true)
		{
			System.out.println(iNo+" is Pallindrome number.");
		}
		else
		{
			System.out.println(iNo+" is not pallindrome number.");
		}
		
		sobj.close();

	}

}
