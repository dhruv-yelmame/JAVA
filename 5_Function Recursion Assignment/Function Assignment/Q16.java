//Q16. Write a java program to find power of a number.


import java.util.*;
public class Q16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		System.out.print("enter the power: ");
		int p = sc.nextInt();
		int res = getPower(n,p);
		System.out.print("Power of Number: "+res);
	}
	
	public static int getPower(int n, int p)
	{
		int pow=1;
		for(int i=1; i<=p; i++)
		{
			pow = pow*n;
		}
		return pow;
		

	}
}