package com.patternPrinting;
/*
 * 1 0 1 0
   0 1 0 1
   1 0 1 0
   0 1 0 1
 * */
public class Pattern_5 
{
	public static void displayPattern()
	{
		for(int i = 1; i<=4;i++)
		{
			if(i % 2 == 0)
			{
				System.out.print("0 1 0 1");
			}
			else
			{
				System.out.print("1 0 1 0");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		displayPattern();

	}

}
