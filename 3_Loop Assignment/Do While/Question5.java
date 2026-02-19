//Q5. Write a java program to print all odd numbers between 1 to 100.


public class Question5
{
	public static void main(String x[])
	{
		int i = 1;
		
		int n = 100;
		do
		{
			if(i%2!=0)
			System.out.print(" "+i);
			i++;
		}while(i<=n);
		
	}
}