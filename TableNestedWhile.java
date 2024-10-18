package Homework;

public class TableNestedWhile 
{

	public static void main(String[] args)
	{
		int i = 2,j = 1;
		
		System.out.println("Table is:");
		
		while(i <= 2) 
		{
			while(j <= 10)
			{
				System.out.println(i + " * " + j + " = " + (i*j));
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
