package com.patternPrinting;

/*
 * A 
   A B 
   A B C 
   A B C D 
   A B C D E 
*/

public class Pattern_3 
{
	public static void displayPattern()
	{
		
		for(char i ='A'; i<='E'; i++)
		{
			for(char j ='A'; j<= i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		displayPattern();

	}

}
