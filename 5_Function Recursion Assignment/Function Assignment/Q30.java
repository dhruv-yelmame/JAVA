//Q30.  Write a java program to display 1 to nth Perfect Number.



import java.util.*;
public class Q30
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckNthPerfect(n);
	}
	
	public static void getCheckNthPerfect(int n)
	{
		for(int i=1; i<=n; i++)
		{
			int sum=0;
			for(int j=1; j<=i/2; j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(sum==i)
			System.out.print(i+" ");
		}	
	}
}