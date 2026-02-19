//Q20. Write a java program to swap first and last digits of a number.


import java.util.*;
public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getFLSwap(n);
	}
	
	public static void getFLSwap(int n)
	{
		System.out.println("Before Swap: "+n);
		int temp=n;
		int last = n%10;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		int p=1;
		for(int i=1; i<count; i++)
		{
			p = p*10;
		}
		n=temp;
		int first=n/p;
		int mid = n%p;
		mid = mid/10;
		int ans = last*p+mid*10+first;
		System.out.println("After Swap: "+ans);
		
	}
}