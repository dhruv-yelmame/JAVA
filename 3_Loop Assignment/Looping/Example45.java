/*Q45. Write a Java program to print all Pronic numbers between 1 and n.
 A Pronic number is the product of two consecutive integers, i.e., n(n+1).
 Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.*/


import java.util.*;
public class Example45
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int p=1;
		
		for(int i=1; i<=n; i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				p=1;
				p = j*(j+1);
		
				if(p==i)
				{
				System.out.print(i+" ");
				}
			}	
		}
	}
}