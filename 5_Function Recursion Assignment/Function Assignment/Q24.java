//Q24. Write a java program to Check Number Is Strong Number or Not.


import java.util.*;
public class Q24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckStrong(n);
	}
	
	public static void getCheckStrong(int n)
	{
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int f=1;
			for(int i=1; i<=rem; i++)
			{
				f = f*i;
			}
			sum+=f;
			n=n/10;
		}
		
		if(sum==temp)
			System.out.print("Strong Number");
		else
			System.out.print("Not Strong Number");
	}
}