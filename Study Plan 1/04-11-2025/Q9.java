//9.Write a program to check whether a number is prime or not using do-while loop.


import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int count=0;
		int i=1;
		do
		{
			if(n%i==0)
			count++;
			i++;
		}while(i<=n);
		
		if(count==2)
			System.out.print("Prime");
		else
			System.out.print("Not Prime");
	}
}