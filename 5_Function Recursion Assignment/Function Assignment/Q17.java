//Q17. Write a java program to find all factors of a number.


import java.util.*;
public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getFactor(n);
	}
	
	public static int getFactor(int n)
	{
		int i;
		for(i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
		return i;
	}
}