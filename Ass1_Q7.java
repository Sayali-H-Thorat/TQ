package Assignment1;

import java.util.Scanner;

//Calculate factorial of a number

public class Ass1_Q7
{
	public static int findfactorial(int No)
	{
		int iCnt = 0,iFact = 1;
		
		for(iCnt = 1;iCnt <= No;iCnt++)
		{
			iFact = iFact * iCnt;
		}
		return iFact;
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number to find factorial:");
		int iNo = sobj.nextInt();
		
		int iRet = findfactorial(iNo);
		
		System.out.println("Factorial of "+iNo+" is: "+iRet);
		
		sobj.close();
	}

}
