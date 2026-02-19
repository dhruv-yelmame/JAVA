/*18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.
*/

import java.util.*;
class LeapYearChecker
{
	public void isLeapYear(int year)
	{
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.print("Leap Year");
		else
			System.out.print("Not Leap Year");
	}
}

public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the year: ");
		int year = sc.nextInt();
		
		LeapYearChecker l = new LeapYearChecker();
		l.isLeapYear(year);
	}
}

