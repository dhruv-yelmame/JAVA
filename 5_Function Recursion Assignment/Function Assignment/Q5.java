//Q5. Write a java program to print all odd numbers between 1 to 100.



public class Q5
{
	public static void main(String x[])
	{
		getEven();	
	}
	
	public static void getEven()
	{
		for(int i=1; i<=100; i++)
		{
			if(i%2!=0)
			System.out.print(i+" ");
		}

	}
}