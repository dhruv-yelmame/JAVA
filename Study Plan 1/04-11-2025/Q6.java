//6.Write a program to check if a number is an Armstrong number.
//153=1^3+5^3+3^3=1+125+27=153

import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
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
			for(int i=0; i<count; i++)
			{
				p = p*rem;
			}
			sum=sum+p;
			n = n/10;
		}
		
		if(temp==sum)
			System.out.print("Armstrong Number");
		else
			System.out.print("Not Armstrong Number");
	}
}