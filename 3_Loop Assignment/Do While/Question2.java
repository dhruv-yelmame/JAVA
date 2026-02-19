//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.


import java.util.*;
public class Question2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();
		
		int i=n;
		do
		{
			System.out.print(" "+i);
			i--;
		}while(1<=i);
		
	}
}