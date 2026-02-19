//Q1. Write a java program to print all natural numbers from 1 to n. using while loop


import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the numbers: ");
		int n = sc.nextInt();
		natNum(n);	
	}
	
	public static void natNum(int n)
	{
		int i=0;
		while(i<n)
		{
			i++;
			System.out.print(i+" ");
		}
	
	}
}