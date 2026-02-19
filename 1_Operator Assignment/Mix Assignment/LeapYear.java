//Q38. Write a Java program to check whether a year is leap year or not.


import java.util.*;
public class LeapYear 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if(year < 1) 
		{
            System.out.println("Invalid Year");
        } 
        else if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
		{
            System.out.println("This is a Leap Year");
        } 
        else 
		{
            System.out.println("This is not a Leap Year");
        }
    }
}
