//4.Write a program to check if a number is a palindrome or not.


import java.util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int temp =n;
		int rev=0;
		for(; n != 0; n = n / 10)
		{
			int rem = n%10;
			rev = rev*10+rem;
		}
		
		if(rev==temp)
			System.out.print("Palidrome");
		else
			System.out.print("Not Palidrome");
	}
}