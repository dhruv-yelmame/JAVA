/*
Q53. Take percentage and income of a student:
If percentage >= 75 AND income < 200000, print "Eligible"
Else "Not Eligible"
*/

import java.util.*;
public class PercentIncome
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the percentage: ");
   int percent = sc.nextInt();

   System.out.println("enter the income: ");
   int income = sc.nextInt();
   
   if(percent>=75 && income<200000)
    {
    System.out.println("Eligible");
    }
   else
    {
    System.out.println("Not Eligible");
    }
  }
}