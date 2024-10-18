package Assignment1;

import java.util.Scanner;

//Count number of digits in any number

public class Ass1_Q8 
{
	public static int countDigits(int No)
	{
		int iCnt = 0,iDigit = 0;
		
		while(No != 0)
		{
			iDigit = No %10;
			No = No/10;
			iCnt++;
		}
		
		return iCnt;
	}

	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iNo = sobj.nextInt();
		
		int iRet = countDigits(iNo);
		
		System.out.println("Count of digits in "+iNo+" number is: "+iRet);
		
		sobj.close();

	}

}
