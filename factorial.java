package forloop;

//1! 2! 3! 4! 5!...n
//1 2 6 24 120 
public class factorial
{
	
	public static void factorial(int No)
	{
		for(int i = 1; i<=No;i++)
		{
			System.out.print(findFactorial(i)+" ");		
		}		
	}
	
	public static int findFactorial(int No)
	{
		int iFact = 1;
		
		for(int iCnt = 1;iCnt <= No; iCnt++)
		{
			iFact = iFact * iCnt;
		}
		return iFact;
	}
	

	public static void main(String[] args) 
	{
		factorial(5);
	}

}
