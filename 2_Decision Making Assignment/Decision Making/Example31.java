//Q31. Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print day of week using if else in java programming.


import java.util.*;
public class Example31
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number(1-7): ");
    int day = sc.nextInt();
	
	if(day==1)
	{
	System.out.println("Monday");
	}
	else if(day==2)
	{
	System.out.println("Tuesday");
	}
	else if(day==3)
	{
	System.out.println("Wednsday");
	}
	else if(day==4)
	{
	System.out.println("Thursday");
	}
	else if(day==5)
	{
	System.out.println("Friday");
	}
	else if(day==6)
	{
	System.out.println("Saturday");
	}
	else if(day==7)
	{
	System.out.println("Sunday");
	}
	else
	{
	System.out.println("Invalid Input");
	}

    
    }

}