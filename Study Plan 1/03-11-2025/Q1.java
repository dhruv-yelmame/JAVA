//Q1. Write a java program to find a maximum between three numbers.


import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.print("First is Greater");
		else if(b>a && b>c)
			System.out.print("Second is Greater");
		else
			System.out.print("Third is Greater");
	}
}