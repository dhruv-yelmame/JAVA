//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop



public class Question4
{
	public static void main(String x[])
	{
		int i = 1;
		
		int n = 100;
		do
		{
			if(i%2==0)
			System.out.print(" "+i);
			i++;
		}while(i<=n);
		
	}
}