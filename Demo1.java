package dowhile;
//print numbers from 1 to 10

public class Demo1 
{
	public static void show()
	{
		int iCnt = 1;
		do
		{
			System.out.println(iCnt);
			iCnt++;
		}
		while(iCnt <= 10);
	}

	public static void main(String[] args) 
	{
		show();

	}

}
