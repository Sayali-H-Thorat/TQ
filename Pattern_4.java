package com.patternPrinting;
/*
 * 1 
   2 3 
   4 5 6 
   7 8 9 10 
*/
public class Pattern_4
{
	public static void displayPattern()
	{
		int num = 1;
		for(int i = 1; i<=4; i++)
		{
			for(int j = 1; j<= i; j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		displayPattern();
	}

}
