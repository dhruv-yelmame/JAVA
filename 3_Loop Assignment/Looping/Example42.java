/*Q42. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45   */

import java.util.*;
public class Example42
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum=0, count=0, rem=0, p=1;
		
		for(int j=1;j<=n;j++)//9
		{		
			int j1=j;//1
			int sq = j1*j1;//1
			count=0;
			while(j1!=0)
			{
				count++;//1
				j1/=10;//0
			}
				 p=1;
				for(int i=1; i<=count; i++)
				{
					p *=10;//10
				}
				
				int right = sq%p;//1
				int left = sq/p;//8
				sum = left + right;
				
		
			if(j==sum)
			{
				System.out.print(j+" ");
			}
		}
	}
}