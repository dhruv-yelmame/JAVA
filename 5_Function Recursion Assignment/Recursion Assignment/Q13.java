//Q13. Write a java program to enter a number and print its reverse.




import java.util.*;
public class Q13
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
		System.out.print("Reverse Number: "+res);
	}
}