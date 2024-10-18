package Assignment1;

import java.util.Scanner;

// WAP to check the 2 number entered are twin prime.Both the numbers should be prime with difference of 2

public class Ass1_Q16 
{
	public static boolean toCheckPrime(int No)
	{
		int iCnt = 0;
		boolean flag = true;
		
		for(iCnt =2; iCnt <= No/2; iCnt++)
		{
			if(No % iCnt == 0)
			{
				flag = false;
				break;
			}
		}		
		return flag;
	}
	
	public static boolean toCheckTwinPrime(int No1,int No2)
	{
		boolean flag = false;
		if(toCheckPrime(No1) && toCheckPrime(No2))
		{
			if(No2 - No1 == 2)
			{
				flag = true;
			}
		}		
		return flag;
	}
	

	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int No1 = sobj.nextInt();
		
		System.out.println("Enter second number:");
		int No2 = sobj.nextInt();
		
		boolean bRet = false;
		
		bRet = toCheckTwinPrime(No1,No2);
		if(bRet == true)
		{
			System.out.println(No1+" and "+No2+" Numbers are twin prime");
		}
		else
		{
			System.out.println(No1+" and "+No2+" Numbers are not twin prime");
		}
		

	}

}
