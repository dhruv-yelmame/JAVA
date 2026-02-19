//Q7. Write a java program to find the sum of all even numbers between 1 to n.

import java.util.*;
public class Question7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int i = 1, sum=0;
		
		do
		{
			if(i%2==0)
			sum+=i;
			i++;
		}while(i<=n);
		System.out.print("Sum is: "+sum);
	}
}