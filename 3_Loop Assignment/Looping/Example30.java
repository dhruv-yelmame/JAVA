/*Q30.  Write a java program to display 1 to nth Perfect Number.*/

import java.util.*;
public class Example30
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();//6
		int sum=0;
		for(int i=1; i<=n; i++)//6
		{ 	sum=0;
			for(int j=1;j<i; j++)//6<=6
			{
				if(i%j==0)//6%3==0
				{
					sum =sum+j;//6
				}
			}
			if(sum==i)
			{
				System.out.println(i);//1
			}
		}
		
	}
}