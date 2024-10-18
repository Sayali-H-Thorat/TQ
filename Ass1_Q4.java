package Assignment1;

//Display the seventh element between 400 to 500(both numbers excluded)
public class Ass1_Q4 
{
	public static void displaySeventhElement()
	{
		int iCnt = 0;
		
		for(iCnt = 401; iCnt < 500;iCnt=iCnt+7)
		{
			System.out.println(iCnt);
		}
	}

	
	public static void main(String[] args) 
	{
		displaySeventhElement();

	}

}
