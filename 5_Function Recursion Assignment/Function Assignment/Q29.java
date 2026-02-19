//Q29. Write a java program to display 1 to nth Prime Number.



import java.util.*;
public class Q29
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckNthPrime(n);
	}
	
	public static void getCheckNthPrime(int n)
	{	
		for(int i=1; i<=n; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				 count++;
			}
			if(count==2)
			System.out.print(i+" ");
		}
		
	}
}
