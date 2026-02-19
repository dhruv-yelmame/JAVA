//Q8. Write a Java program to check whether a year is a leap year or not.


import java.util.*;
public class Example8
{
 public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the year: ");
 int year = sc.nextInt();
 
 if(year < 4)
 {
	 System.out.println("Invalid Year");
 }
 else if(year % 4 == 0 || year % 400 == 0 && year %100 !=0)
 {
 System.out.println("This is Leap Year");
 }
 else
 {
 System.out.println("This is not Leap Year");
 }
 
}
}