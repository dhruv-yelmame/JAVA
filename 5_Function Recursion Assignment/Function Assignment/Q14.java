//Q14. Write a java program to check whether a number is palindrome or not.


import java.util.*;
public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int rev = getReverse(n);	
		if(rev==n)
		System.out.print("Palindrome");
		else
		System.out.print("Not Palindrome");
	}
	
	public static int getReverse(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		return sum;
	}
}