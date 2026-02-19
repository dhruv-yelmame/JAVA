//Q17. Write a java program to find all factors of a number.


import java.util.*;
public class Q17
{
	public static int show(int n, int i)
	{
		if(i==n)
			return i;
		
		if(n%i==0)
			System.out.print(i+" ");
		return show(n, i+1);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		System.out.print("Factors: ");
		show(n, 1);
	}
}