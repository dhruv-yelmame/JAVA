//Q2. Write a Java program to check whether a triangle is valid or not.


import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the three angle of triangle: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int res = a+b+c;
		
		if(res==180 && a > 0 && b > 0 && c > 0)
			System.out.print("Valid Traingle");
		else
			System.out.print("Not Valid Traingle");
	}
}