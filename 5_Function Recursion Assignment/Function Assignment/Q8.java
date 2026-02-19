//Q8. Write a java program to find the sum of all odd numbers between 1 to n.



import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int res = getSum(n);	
		System.out.print("Sum is: "+res);
	}
	
	public static int getSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
			sum+=i;
		}
		return sum;
	}
}