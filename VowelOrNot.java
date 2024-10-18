package SwitchCaseDemo;

import java.util.Scanner;

public class VowelOrNot
{
	public static void checkVowels(char ch)
	{
		switch(ch)
		{
		case 'A','E','I','O','U':
								System.out.println(ch+" is upper case vowel");
								break;
		case 'a','e','i','o','u':
								System.out.println(ch+" is lower case vowel");
								break;
		case '0','1','2','3','4','5','6','7','8','9':
								                     System.out.println(ch+" is digit");
								                      break;
		case '@','#','$','%','&','!':
			                         System.out.println(ch+" is special case character.");
									 break;
		default:
			   System.out.println(ch+" is consonent");
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sobj.next().charAt(0);
		
		checkVowels(ch);
		
		sobj.close();
//		char ch= 'A';
//		checkVowels(ch);
//		
//		char ch1= 'e';
//		checkVowels(ch1);
//		
//		char ch2= 'Z';
//		checkVowels(ch2);
		
	}

}
