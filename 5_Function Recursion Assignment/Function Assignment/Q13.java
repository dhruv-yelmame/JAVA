//Q13. Write a java program to enter a number and print its reverse.


import java.util.*;
public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int rev = getReverse(n);	
		System.out.print("Reverse of Digit: "+rev);
	}
	
	public static int getReverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem = n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}