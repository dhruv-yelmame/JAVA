//Q1. Write a Java program to check whether a number is even or odd.

import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		if(n%2==0)
			System.out.print("Even");
		else
			System.out.print("Odd");
	}
}