package Assignment1;

//Display all even numbers from 1 to 100

public class Ass1_Q2 
{
	public static void displayEven()
	{
		int iCnt = 0;
		
		for(iCnt = 1;iCnt<= 100;iCnt++)
		{
			if(iCnt %2 == 0)
			{
				System.out.print(iCnt+"\t");
			}
		}
	}

	public static void main(String[] args) 
	{
		displayEven();

	}

}
