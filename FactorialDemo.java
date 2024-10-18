package com.methodwriting;

public class FactorialDemo 
{
	public int findFactorial(int num)
	{
		int fact =1;
		while(num > 0)
		{
			fact = fact *num;
			num--;
		}		
		
		return fact;
	}
	
	public int findFactorialfor(int num)
	{
		int fact = 1,iCnt =0;
		for(iCnt  = 1; iCnt <=num; iCnt++)
		{
			fact = fact *iCnt;
		}
		return fact;
	}
	

	public static void main(String[] args) 
	{
		FactorialDemo obj = new FactorialDemo();
		
		int f = obj.findFactorial(5);
		System.out.println("Factorial of 5 using while is: "+f);
		
		int f2=obj.findFactorialfor(5);
		System.out.println("Factorial of 5 using for loop is: "+f2);
	}

}
