package com.methodwriting;

import java.util.Scanner;

/*base =2
 * power = 4
 * 2*2*2*2= 16
 * */
public class PowerOfNumber 
{
	public static int power(int base,int power)
	{
		int iCnt = 0,iResult=1;
		for(iCnt = 1;iCnt<=power;iCnt++)
		{
			iResult= iResult*base;
		}
		
		return iResult;
		
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the base value:");
		int base =sobj.nextInt();
		
		System.out.println("Enter the power value:");
		int power =sobj.nextInt();
		
		int iRet = power(base,power);
		
		System.out.println("Value of "+base+" raised to "+power+" is: "+iRet);
		
		sobj.close();


	}

}
