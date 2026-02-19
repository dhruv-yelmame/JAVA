//Q25. Write a java program to Check Number Is Armstrong Number or Not.


import java.util.*;
public class Q25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckArmstrong(n);
	}
	
	public static void getCheckArmstrong(int n)
	{
		int temp=n;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		int sum=0;
		n=temp;
		while(n!=0)
		{
			int rem = n%10;
			int p=1;
			for(int i=1; i<=count; i++)
			{
				p = p*rem;
			}
			sum+=p;
			n=n/10;
		}
		if(sum==temp)
			System.out.print("Armstrong Number");
		else
			System.out.print("Not Armstrong Number");
	}
}