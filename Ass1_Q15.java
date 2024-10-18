package Assignment1;

import java.util.Scanner;

public class Ass1_Q15 
{
	public static boolean checkArmstrong(int No)
	{
		int iDigit = 0,iSum = 0,iTemp = No;
		
		while(No != 0)
		{
			iDigit = No %10;
			iSum = iSum+(iDigit*iDigit*iDigit);
			No = No/10;
		}
		if(iSum == iTemp)
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
		
		System.out.println("Enter the number:");
		int iNo = sobj.nextInt();
		
		boolean bRet = false;
		
		bRet = checkArmstrong(iNo);
		if(bRet == true)
		{
			System.out.println(iNo+" is Armstrong number.");
		}
		else
		{
			System.out.println(iNo+" is not Armstrong number.");
		}
		
		sobj.close();

	}

}
