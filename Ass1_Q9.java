package Assignment1;

import java.util.Scanner;

//Generate fibonacci series. 0,1,1,2,3,5,8...k. where k <n. n is entered by user

public class Ass1_Q9 
{
	
	public static void fibonacciSeries(int No)
	{
		int first = 0,second = 1,third = 0,iCnt = 0;
		
		System.out.print(first+"\t");
		System.out.print(second+"\t");
		
		for(iCnt = 2;iCnt < No; iCnt++)
		{
			third = first+second;
			System.out.print(third+"\t");
			first = second;
			second = third;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iNo = sobj.nextInt();
		
		fibonacciSeries(iNo);
		
		sobj.close();

	}

}
