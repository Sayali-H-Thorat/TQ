package Assignment1;

import java.util.Scanner;

//Check a number is Krishamurthy or not

public class Ass1_Q14
{
	public static boolean checkKrishnamurthyNumber(int No)
	{
		
		int iSum = 0;
		int rem = 0;
		int original = No;
		while(No > 0)
		{
			rem = No %10;
			iSum = iSum +factorial(rem);
			No = No /10;
		}
		if(iSum == original)
		{
			return true;
		}
		else
		{
			return false;			
		}
	}
	public static int factorial(int No)
	{
		int iFact = 1;
		int icnt = 0;
		for(icnt = 1; icnt <= No; icnt++)
		{
			iFact = iFact * icnt;
		}
		return iFact;
		
		
	}

	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iNo = sobj.nextInt();
		
		boolean bRet;
		
		bRet = checkKrishnamurthyNumber(iNo);
		
		if(bRet == true)
		{
			System.out.println(iNo+" is Krishnamurthy number.");
		}
		else
		{
			System.out.println(iNo+" is not Krishnamurthy number.");			
		}
		
		sobj.close();

	}

}
