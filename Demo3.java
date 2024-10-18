package forloop;

public class Demo3
{
	public static void displayNumberSeries(int terms)
	{
		int No = 0;
		for(int iCnt = 1; iCnt <= terms;iCnt++)
		{
			No = No*2+1;
			System.out.print(No+" ");
		}
		
	}

	public static void main(String[] args) 
	{
		displayNumberSeries(10);

	}

}
