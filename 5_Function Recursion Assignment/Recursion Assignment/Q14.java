//Q14. Write a java program to check whether a number is palindrome or not.



import java.util.*;
public class Q14
{
	public static int show(int rev, int n)
	{
		if(n==0)
			return rev;
			
		int rem = n%10;
		rev = rev*10+rem;
		return show(rev, n/10);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int res = show(0, n);
		
		if(res==n)
		System.out.print("Palindrom Number");
		else
		System.out.print("Not Palindrom Number");
	}
}
