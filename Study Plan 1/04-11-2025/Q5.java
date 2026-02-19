//5.Write a program to count the number of digits in a given number.


import java.util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		
		System.out.print(count);
	}
}