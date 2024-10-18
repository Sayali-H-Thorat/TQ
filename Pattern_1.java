package com.patternPrinting;

/* display below pattern
* 1 
* 1 1 
* 1 1 1 
* 1 1 1 1 
* 1 1 1 1 1 
*/
public class Pattern_1 
{
	public static void displayPattern()
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args)
	{
		displayPattern();
	}

}
