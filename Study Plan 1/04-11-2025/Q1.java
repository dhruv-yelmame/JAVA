//1.Write a program to print Fibonacci series up to n terms.


import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		
		for(int i=1; i<=n-2; i++)
		{
			int c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
}