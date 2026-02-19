//Q22. Write a java program to Check Number Is Perfect Number or Not.


import java.util.*;
public class Q22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckPerfect(n);
	}
	
	public static void getCheckPerfect(int n)
	{
		int sum=0;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			System.out.print("Perfect Number");
		else
			System.out.print("Not Perfect Number");
	}
}