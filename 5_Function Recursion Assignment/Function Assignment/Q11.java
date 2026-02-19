//Q11. Write a java program to calculate the sum of digits in a number.


import java.util.*;
public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int sum = getSum(n);	
		System.out.print("Sum of Digit: "+sum);
	}
	
	public static int getSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}
}