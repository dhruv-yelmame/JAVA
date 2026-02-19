//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.



import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the numbers: ");
		int n = sc.nextInt();
		natNum(n);	
	}
	
	public static void natNum(int n)
	{
		for(int i=n; i>=1; i--)
		{
			System.out.print(i+" ");
		}

	}
}