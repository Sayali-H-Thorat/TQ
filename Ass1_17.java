package Assignment1;

//Number is automorphic or not

public class Ass1_17 
{
	public static boolean isAutomorphic(int No)
	{
		int square = No * No;
		
		while(No > 0)
		{
			if(No %10 != square %10)
			{
				return false;
			}
			No = No /10;
			square = square /10;
		}
		return true;
		
	}
 
	public static void main(String[] args) 
	{
		System.out.println(isAutomorphic(76));
	}

}
