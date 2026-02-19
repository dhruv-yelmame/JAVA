//Q23. Write a java program to Check Number Is Duck Number or Not.


import java.util.*;
public class Q23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckDuck(n);
	}
	
	public static void getCheckDuck(int n)
	{
		boolean flag = false;
		while(n!=0)
		{
			int rem=n%10;
			if(rem==0)
			{
				flag=true;
				break;
			}
			n=n/10;
		}
		
		if(flag)
			System.out.print("Duck Number");
		else
			System.out.print("Not Duck Number");
	}
}