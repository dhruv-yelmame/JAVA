//Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.



import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the three angle of triangle: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a + b > c && a + c > b && b + c > a)
		{
			if(a == b && b == c)
				System.out.println("Equilateral Triangle");
			else if(a == b || b == c || a == c)
				System.out.println("Isosceles Triangle");
			else
				System.out.println("Scalene Triangle");
		}
		else
		{
			System.out.println("Not a Valid Triangle");
		}
	}
}