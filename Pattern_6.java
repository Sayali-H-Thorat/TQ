package com.patternPrinting;

public class Pattern_6 
{
	public static void displayPattern()
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int k = 2*(5-1); k>0; k--)
			{
				System.out.print("");
			}	
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		displayPattern();
	}
}
