/*Q43. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.*/

import java.util.*;
public class Example43
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//135
		int count=0, rem=0, sum=0, p=1;
		
		
		for(int j=1; j<=n; j++)
		{
			int j1=j;
			int j2=j;
			
			count=0;
			while(j1!=0)
			{
				count++;
				j1=j1/10;
			}
			
			sum=0;
			while(j2!=0)
			{
			rem=j2%10;
			p=1;
			for(int i=1; i<=count; i++)
			{
				p = p*rem;
			}
			sum=sum+p;
			j2=j2/10;
			--count;
			}
			
			if(j==sum)
			{
				System.out.print(j+" ");
			}
		}
	}
}