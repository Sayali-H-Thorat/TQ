package Assignment1;

import java.util.Scanner;

public class Ass1_Q22 
{
	public static void displayFrequency(int No)
	{
		int iTemp = No,iDigit = 0;
		int iFrequency[] = new int[10];
		
		while(iTemp != 0)
		{
			iDigit = iTemp %10;
			iFrequency[iDigit]++;
			iTemp = iTemp /10;
		}
		
		for(int iCnt = 0;iCnt < 10; iCnt++)
		{
			if(iFrequency[iCnt] >0)
			{
				System.out.println(iCnt+" occurs "+iFrequency[iCnt]+" times.");
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int iNo = sobj.nextInt();
		
		displayFrequency(iNo);		

	}

}
