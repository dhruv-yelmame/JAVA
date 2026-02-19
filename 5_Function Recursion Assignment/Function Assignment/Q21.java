//Q21. Write a java program to check Number Is Prime Number or Not.

import java.util.*;
public class Q21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckPrime(n);
	}
	
	public static void getCheckPrime(int n)
	{
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
				count++;
		}
		
		if(count==2)
			System.out.print("Prime Number");
		else
			System.out.print("Not Prime Number");
	}
}
