//Q16. Write a java program to find power of a number.


import java.util.*;
public class Q16
{
	public static int show(int n, int p)
	{
		if(p==1)
			return n;

		return n * show(n, p-1);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		System.out.print("enter the power: ");
		int p = sc.nextInt();
		
		int res = show(n,p);
		System.out.print("Power of Number: "+res);
	}
}