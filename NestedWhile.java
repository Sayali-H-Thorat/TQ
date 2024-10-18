package Homework;

public class NestedWhile {

	public static void main(String[] args) 
	{
		int outer = 1;
		while(outer <3)
		{
			int inner = 1;
			while(inner < 5)
			{
				System.out.println("Outer: "+outer+" Inner: "+inner);
				inner++;
			}
			outer++;
		}

	}

}
