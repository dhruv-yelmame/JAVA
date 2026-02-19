//Q28. Write a java program to Check Number Is Spy Number or Not.


import java.util.*;
public class Q28
{
	public static int show(int n, int sum, int product)
	{
		if(n==0)
		{
			if(sum==product)
			return 1;
			else
			return 0;
		}
			
		int rem = n%10;
		sum +=rem;
		product *=rem;
			
		return show(n/10, sum, product);
			
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//1412
		
		int res = show(n, 0, 1);
		
		if(res==1)
		{
			System.out.print("Spy Number");
		}
		else
		{
			System.out.print("Not Spy Number");
		}
	}
}