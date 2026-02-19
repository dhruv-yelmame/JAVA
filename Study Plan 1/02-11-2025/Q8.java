//Q8. Write a Java program to check whether a year is a leap year or not.



import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the year: ");
		int year = sc.nextInt();
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			System.out.print("Leap Year");
		else
			System.out.print("Not Leap year");
	}
}