//Q22. Write a program to find first and last digit of a number without using loop in three digit.

import java.util.Scanner;
public class FLNumber
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number: ");
 int no = sc.nextInt();
 
 int rem1 = no/100;
 int rem2 = no%10;
 System.out.println("First & Last Digit Number is:"+rem1+ "," +rem2);
 
 }
}