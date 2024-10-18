package Assignment1;

import java.util.Scanner;

//find gcd and lcm
public class Ass1_18
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
	
	public static int findLCM(int No1,int No2)
	{
		int lcm = 0;
		
		lcm = No1*No2/findGCD(No1,No2);
		
		return lcm;
		
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int iNo1 = sobj.nextInt();
		
		System.out.println("Enter second number:");
		int iNo2 = sobj.nextInt();
		
		int gcd = findGCD(iNo1,iNo2);
		System.out.println("GCD of "+iNo1+" and "+iNo2+" is: "+gcd);
		
		int lcm = findLCM(iNo1,iNo2);
		System.out.println("LCM of "+iNo1+" and "+iNo2+" is: "+lcm);
		

	}

}
