/*Q3. Write a program with a class MaxFinder having overloaded max() methods that return the largest value among:
two integers,
three integers, and
two double values.
*/


import java.util.*;
public class MaxFinder
{
	static void max(int a, int b)
	{
		if(a>b)
			System.out.print(a+" is max");
		else if(b>a)
			System.out.print(b+" is max");
		else
			System.out.print("both are equal");
	}
	
	static void max(int a, int b, int c)
	{
		if(a>b && a>c)
			System.out.print(a+" is max");
		else if(b>a && b>c)
			System.out.print(b+" is max");
		else if(c>a && c>b)
			System.out.print(c+" is max");
		else
			System.out.print("both are equal");
	}
	
	static void max(double a, double b)
	{
		if(a>b)
			System.out.print(a+" is max");
		else if(b>a)
			System.out.print(b+" is max");
		else
			System.out.print("both are equal");
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number: ");
		int a = sc.nextInt();
		System.out.print("enter second number: ");
		int b = sc.nextInt();
		System.out.print("enter third number: ");
		int c = sc.nextInt();
		
		max(a, b);
		max(a, b, c);
		max((double)a, (double)b);
	}
}