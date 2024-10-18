package Assignment1;

//find all prime numbers < 100

public class Ass_Q6 
{
	public static boolean checkPrime(int No)
	{
		int iCnt = 0;
		boolean flag = true;
		
		for(iCnt = 2; iCnt <= No/2; iCnt++)
		{
			if(No % iCnt ==0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void displayPrimeNumber()
	{
		int iCnt = 0;
		
		for(iCnt = 1; iCnt < 100;iCnt++)
		{
			if(checkPrime(iCnt))
			{
				System.out.println(iCnt+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		displayPrimeNumber();
	}

}
