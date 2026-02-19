//Q3. Write a java program to accept two integers and check whether they are equal or not.


import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number: ");
		double a = sc.nextDouble();
		System.out.println("enter the second number: ");
		double b = sc.nextDouble();
		
		
		if(a==b)
			System.out.print("Equal");
		else
			System.out.print("Not Equal");
	}
}