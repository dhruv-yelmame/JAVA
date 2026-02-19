//Q28. Write a java program to Check Number Is Spy Number or Not.


import java.util.*;
public class Q28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckSpy(n);
	}
	
	public static void getCheckSpy(int n)
	{
		int product=1, sum=0;
		while(n!=0)
		{
			int rem = n%10;
			product=product*rem;
			sum=sum+rem;
			n=n/10;
		}
		
		if(product==sum)
			System.out.print("Spy Number");
		else
			System.out.print("Not Spy Number");
	}
}