//Q26. Write a java program to Check Number Is Neon Number or Not.


import java.util.*;
public class Q26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckNeon(n);
	}
	
	public static void getCheckNeon(int n)
	{
		int sum=0;
		int sq = n*n;
		while(sq!=0)
		{
			int rem = sq%10;
			sum+=rem;
			sq=sq/10;
		}
		
		if(sum==n)
			System.out.print("Neon Number");
		else
			System.out.print("Not Neon Number");
	}
}