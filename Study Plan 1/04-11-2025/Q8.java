//8.Write a program to find the factorial of a number using do-while loop..

import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//5
		
		int fact=1;
		do
		{
			fact = fact*n;
			n = n - 1;
		}while(n>=1);
		
		System.out.print(fact);
	}
}