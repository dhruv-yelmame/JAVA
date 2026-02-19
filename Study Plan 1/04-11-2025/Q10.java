//10.Write a program to find the sum of first n natural numbers using do-while.


import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int i=1;
		int sum=0;
		do
		{
			sum+=i;
			i++;
		}while(i<=n);
		
		System.out.print("Sum:"+sum);
	}
}