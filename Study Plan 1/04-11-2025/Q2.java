//2.Write a program to count the number of digits in a given number using for loop.


import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int count=0;
		for(; n != 0; n = n / 10)
		{
			count++;
		}
		
		System.out.print("Count: "+count);
	}
}