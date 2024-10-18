package dowhile;
//find factorial of number using do while 
import java.util.Scanner;

public class Factorial 
{
	public static int findFactorial(int iNo)
	{
		int iFact = 1,iCnt = 1;
		do
		{
			iFact = iFact *iCnt;
			iCnt++;
		}
		while(iCnt<=iNo);
		
		return iFact;
	}

	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int ino = sobj.nextInt();
		
		int iRet = findFactorial(ino);
		System.out.println("Factorial of "+ino+" is: "+iRet);
		
		sobj.close();		

	}

}
