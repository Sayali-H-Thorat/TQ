package com.methodwriting;

import java.util.Scanner;

//import java.util.Scanner;

//find maximum of two numbers

public class FindMaxofTwoNumbers 
{
	public static int findMax(int n1,int n2)
	{
		int max= 0;
		if(n1>n2)
			max= n1;
		else
			max = n2;
		return max;
	}

	public static void main(String[] args) 
	{
//		int num1 = 34,num2 = 56;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = sobj.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = sobj.nextInt();
		
		int m = findMax(num1,num2);
		System.out.println("Maximum number is:"+m);
		
		sobj.close();

	}

}
