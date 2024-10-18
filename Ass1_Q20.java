package Assignment1;

import java.util.Scanner;

//find the number is coprime or not
public class Ass1_Q20 
{
	public static int findGCD(int No1,int No2)
	{
		int gcd = 1,iCnt = 0;
		
		for(iCnt = 1; iCnt <= No1 && iCnt <= No2; iCnt++)
		{
			if((No1 % iCnt == 0) && (No2 % iCnt == 0))
			{
				gcd = iCnt;
			}
			
		}		
		return gcd;
	}

	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int No1 = sobj.nextInt();
		
		System.out.println("Enter the second number:");
		int No2 = sobj.nextInt();
		
		int iRet = findGCD(No1,No2);
		if(iRet == 1)
		{
			System.out.println(No1+" and "+No2+" are co-prime numbers.");
		}
		else
		{
			System.out.println(No1+" and "+No2+" are not co-prime numbers.");
		}
		
		

	}

}
