//Q26. Write a java program to Check Number Is Neon Number or Not.


import java.util.*;
public class Q26
{
	public static int show(int sq, int sum)
	{
		if(sq==0)
			return sum;
		
		int rem = sq%10;
		sum +=rem;
		
		return show(sq/10, sum);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int sq = n*n;
		
		int sum = show(sq, 0);
	
		if(sum==n)
		{
			System.out.print("Neon Number");
		}
		else
		{
			System.out.print("Not Neon Number");
		}
	}
}