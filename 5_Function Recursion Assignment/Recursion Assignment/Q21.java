//Q21.  Write a java program to check Number Is Prime Number or Not.


import java.util.*;
public class Q21
{
	public static int show(int n, int i, int count)
	{
		if(i>n)
			return count;
		
		if(n%i==0)
		 count++;
		
		return show(n, i+1, count);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int res = show(n, 1, 0);
		
		
		if(n<1)
			System.out.print("Not Prime Number");
		else if(res==2)
			System.out.print("Prime Number");
		else
			System.out.print("Not Prime Number");
		
	}
}