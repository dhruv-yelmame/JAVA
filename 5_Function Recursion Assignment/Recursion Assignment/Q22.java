//Q22. Write a java program to Check Number Is Perfect Number or Not.


import java.util.*;
public class Q22
{
	public static int show(int n, int i, int sum)
	{
		if(i>=n)
			return sum;
		
		if(n%i==0)
		 sum+=i;
		
		return show(n, i+1, sum);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int res = show(n, 1, 0);
		
		if(n<1)
			System.out.print("Not Perfect Number");
		else if(n==res)
			System.out.print("Perfect Number");
		else
			System.out.print("Not Perfect Number");
		
	}
}