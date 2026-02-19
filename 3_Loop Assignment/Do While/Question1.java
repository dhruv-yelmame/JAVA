//Q1. Write a java program to print all natural numbers from 1 to n. using do while loop

import java.util.*;
public class Question1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();
		
		int i=1;
		do
		{
			System.out.print(" "+i);
			i++;
		}while(i<=n);
		
	}
}