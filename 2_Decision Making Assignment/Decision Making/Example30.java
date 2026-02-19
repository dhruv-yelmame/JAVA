//Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming.


import java.util.*;
public class Example30
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the month: ");
	int month = sc.nextInt();

	
	if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10|| month==12)
	{
	System.out.println("31 days");
	}
	else if(month==2)
	{
	System.out.println("28/29 days");
	}
	else
	{
	System.out.println("30 days");
	}
  }
}