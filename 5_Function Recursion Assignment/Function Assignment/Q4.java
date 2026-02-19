//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop



public class Q4
{
	public static void main(String x[])
	{
		getEven();	
	}
	
	public static void getEven()
	{
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			System.out.print(i+" ");
		}

	}
}