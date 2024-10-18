package dowhile;

import java.util.Scanner;

public class CountDigits 
{
	
	public static int countDigits(int No)
	{
		int iDigit = 0,iCnt = 0;
		do
		{
			iDigit = No %10;
			No = No/10;
			iCnt++;
		}
		while(No != 0);
		
		return iCnt;
	}

	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iNo = sobj.nextInt();
		
		int iRet = countDigits(iNo);
		
		System.out.println("Digits in number are:"+iRet);
		
		sobj.close();

	}

}
