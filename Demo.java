package forloop;
//Square of a number
//1,4,9,16,25,36,49,64,81
public class Demo 
{
	public static void show(int terms)
	{
		for(int i = 1; i<= terms; i++)
		{
			System.out.print(i*i+" ");
		}
	}

	public static void main(String[] args) 
	{
		show(9);
	
	}

}
