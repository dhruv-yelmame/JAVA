//Q11. Write a java program to calculate the sum of digits in a number.


import java.util.*;
public class Q11
{
	public static int show(int n)
	{
		if(n==0)
			return 0;
			
		int rem = n%10;
		return rem + show(n/10);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int res = show(n);
		System.out.print("sum of digits in number: "+res);
	}
}