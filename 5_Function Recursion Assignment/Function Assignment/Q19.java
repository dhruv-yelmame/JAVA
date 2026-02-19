//Q19. Write a java program to find the sum of the first and last digit of a number.


import java.util.*;
public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getSFL(n);
	}
	
	public static void getSFL(int n)
	{
		int last = n%10;
		int first = n;
		while(first>=10)
		{
			first=first/10;
		}
		int sum = first+last;
		System.out.print("Sum: "+sum);
	}
}
