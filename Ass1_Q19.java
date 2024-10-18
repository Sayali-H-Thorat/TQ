package Assignment1;
//find Maximum and minimum digit
import java.util.Scanner;

public class Ass1_Q19 
{
	public static void findMinMaxAndSwap(int iNo)
	{
		int iMax =0,iDigit = 0,iMin = 9;
		
		while(iNo != 0)
		{
			iDigit = iNo %10;
			if(iDigit > iMax)
			{
				iMax=iDigit;
			}
			else if(iDigit < iMin)
			{
				iMin = iDigit;
			}
			iNo = iNo / 10;		
		}
		System.out.println("Minimum digit is: "+iMin);
		System.out.println("Maximum digit is: "+iMax);
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iNo = sobj.nextInt();
		
		findMinMaxAndSwap(iNo);

	}

}
