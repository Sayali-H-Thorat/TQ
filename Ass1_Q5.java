package Assignment1;

//Find first 10 even numbers

public class Ass1_Q5 
{
	public static void first10EvenNumbers()
	{
		int cnt = 0;
		int No = 1;
		System.out.println("First 10 odd numbers are:");
		for(int i = 1;cnt < 10;i++)
		{
			if(No %2 == 0 )
			{
				System.out.print(No+"\t");	
				cnt++;
			}
			No++;
		}
	}

	public static void main(String[] args) 
	{
		first10EvenNumbers();
		

	}

}
