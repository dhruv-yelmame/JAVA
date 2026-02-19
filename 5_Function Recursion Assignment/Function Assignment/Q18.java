//Q18. Write a java program to find the first and last digit of a number.



import java.util.*;
public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getFLD(n);
		
	}
	
	public static void getFLD(int n)
	{
		int last = n % 10;
		int first = n;
		while(first>=10) 
		{
			first = first / 10;
		}
			
		System.out.print("first: "+first+"\tLast: "+last);
		
	}
}