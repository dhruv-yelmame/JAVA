/*Q25. Write a java program to Check Number Is Armstrong Number or Not.*/
//A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.

import java.util.*;
public class Example25
{
	public static void main(String x[])
	{	
		int n, temp, sum=0, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		n = sc.nextInt();//153
        temp=n;
		
		while(n!=0)
		{
			count++;
			n=n/10;
		}
	    n=temp;
		int rem=0;
		while(n!=0)//153!=0,15!=0,1!=0
		{
			int p=1;
			rem=n%10;//3 , 5 , 1
			for(int i=1; i<=count; i++)
			{
				p = p*rem;
			}
			sum=sum+p;//0+3^3=27, 27+5^5=152 + 152+1^1=153 
			n=n/10;//15, 1, 0
		}
		n=temp;
		if(sum==temp)
		{
		System.out.println("Armstrong Number");
		}
		else
		{
		System.out.println("Not Armstrong Number");
		}
		
	}
}