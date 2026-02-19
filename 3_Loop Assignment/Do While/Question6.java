//Q6. Write a java program to find the sum of all natural numbers between 1 to n.


import java.util.*;
public class Question6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();
		
		int i=1, sum=0;
		do
		{
			sum+=i;
			i++;
		}while(i<=n);
		System.out.print("Sum is: "+sum);
		
	}
}