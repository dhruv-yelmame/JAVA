//Q7. Write a java program to find the maximum between two numbers.


import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		
		if(a>b)
			System.out.print("First is Maximum");
		else if(a==b)
			System.out.print("Both are equal");
		else
			System.out.print("Second is Maximum");
	}
}