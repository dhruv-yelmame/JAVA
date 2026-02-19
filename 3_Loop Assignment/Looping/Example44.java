/*Q44. Write a Java program to find all Abundant numbers up to n.
 An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.
*/

import java.util.*;
public class Example44
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//100
		int sum=0;
		
		for(int i=1; i<=n; i++)
		{
			
			sum=0;
			for(int j=1; j<=i/2; j++)
			{
				if(i%j==0)
				sum+=j;
			}
		
		
			if(sum>i)
			{
				System.out.print(i+" ");
			}
			
		}
	}
}