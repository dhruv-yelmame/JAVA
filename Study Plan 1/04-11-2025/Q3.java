//3.Write a program to print reverse of a number using for loop.


import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int rev=0;
		for(; n != 0; n = n / 10)
		{
			int rem=n%10;
			rev = rev*10+rem;
		}
		
		System.out.print("Reverse Number: "+rev);
	}
}