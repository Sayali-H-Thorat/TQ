package forloop;

//1,22,333,4444,5555

public class Demo2 
{
	public static void displayNumber(int No)
	{
		for(int i = 1; i <= No;i++)
		{
			for(int j= 1; j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.print(" ");
		}
	}
	

	public static void main(String[] args) 
	{
		displayNumber(9);

	}

}
