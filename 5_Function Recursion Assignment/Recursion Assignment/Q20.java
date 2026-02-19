//Q20. Write a java program to swap first and last digits of a number.


import java.util.*;
public class Q20
{
	public static int show(int n)
	{
		if(n<10)
			return n;
		return show(n/10);
	
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//12345
		int temp=n;
		int last=n%10;
		int first = show(n);
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		int p=1;
		for(int i=1; i<count; i++)
		{
			p=p*10;
		}
		int first=temp/p;
		int mid = temp%p; 
		mid = mid/10;
		
		int ans = last*p+mid*10+first;
		System.out.print("Swap Number: "+ans);
	}
}