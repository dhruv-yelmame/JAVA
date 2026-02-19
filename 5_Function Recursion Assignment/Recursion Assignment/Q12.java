//Q12. Write a java program to calculate the product of digits in a number.



import java.util.*;
public class Q12
{
	public static int show(int n)
	{
		if(n==0)
			return 1;
			
		int rem = n%10;
		return rem * show(n/10);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int res = show(n);
		System.out.print("product of digits in number: "+res);
	}
}