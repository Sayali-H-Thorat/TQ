package Assignment1;

//Display all odd numbers from 200 to 300
public class Ass1_Q3 
{
	public static void displayOdd()
	{
		int iCnt = 0;
		
		for(iCnt=200;iCnt<=300;iCnt++)
		{
			if(iCnt % 2 != 0)
			{
				System.out.print(iCnt+"\t");
			}
		}
	}

	public static void main(String[] args)
	{
		displayOdd();
		
	}

}
