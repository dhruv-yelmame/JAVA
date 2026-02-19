/*Q2. Create a class Adder that contains overloaded methods named sum() to calculate:
sum of two integers,
sum of three integers, and
sum of two double values.
*/


import java.util.*;
public class Adder
{
	static void sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("Two Integer Sum: "+sum);
	}
	
	static void sum(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Three IntegerSum: "+sum);
	}
	
	static void sum(double a, double b)
	{
		double sum = a + b;
		System.out.println("Two Double Sum: "+sum);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int a = sc.nextInt();
		System.out.print("enter the second number: ");
		int b = sc.nextInt();
		System.out.print("enter the third number: ");
		int c = sc.nextInt();
		
		sum(a, b);
		sum(a, b, c);
		sum((double)a, (double)b);
	}
}