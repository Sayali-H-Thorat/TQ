package Assignment1;
//Show how many notes of 2000,500,200,100,50 will be disbursed by ATM machine for given amount

import java.util.Scanner;

public class Ass1_Q21
{
	public static void amtDistribution(int amt)
	{
		if(amt < 50)
		{
			System.out.println("Please enter valid amount in multiple of 2000,500,200,100,50");
		}
		if(amt > 2000)
		{
			int notes_2000 = amt/2000;
			amt = amt - (2000 * notes_2000);
			System.out.println("Notes of 2000 are :" +notes_2000);
		}
		if(amt > 500)
		{
			int notes_500 = amt/500;
			amt = amt - (500 * notes_500);
			System.out.println("Notes of 500 are :" +notes_500);
		}
		if(amt > 200)
		{
			int notes_200 = amt/200;
			amt = amt - (200 * notes_200);
			System.out.println("Notes of 200 are :" +notes_200);
		}
		if(amt >= 100)
		{
			int notes_100 = amt/100;
			amt = amt - (100 * notes_100);
			System.out.println("Notes of 100 are :" +notes_100);
		}
		if(amt >= 50)
		{
			int notes_50 = amt/50;
			amt = amt - (50 * notes_50);
			System.out.println("Notes of 50 are :" +notes_50);
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the amount to distribute notes:");
		int amt = sobj.nextInt();
		
		amtDistribution(amt);
		
	}

}
