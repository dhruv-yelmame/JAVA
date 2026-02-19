//Q4. Write a Java program to check whether a number is positive , negative or zero.


import java.util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		if(n>0)
			System.out.print("Positive");
		else if(n<0)
			System.out.print("Negative");
		else
			System.out.print("Zero");
	}
}