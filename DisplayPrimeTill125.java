package com.methodwriting;
//Number divisible by one and itself
//1,2,3,5,7,11,13,17
public class DisplayPrimeTill125 
{
	public static boolean checkPrime(int No)
	{
		int iCnt = 0;
		boolean flag = true;
		
		for(iCnt = 2;iCnt <=No/2;iCnt++)
		{
			if(No % iCnt == 0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void printPrimeNumber()
	{
		for(int i =1;i <= 125; i++)
		{
			if(checkPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		printPrimeNumber();
	}

}
