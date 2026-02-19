/*
Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary if:
basicSalary = 35000
taxRate = 12%
 Find netSalary.
*/

import java.util.*;
public class NetSalaryAAO
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the basic salary: ");
    int basic = sc.nextInt();

    System.out.println("enter the basic tax rate: ");
    int tax = sc.nextInt();
    
    int grossSalary = basic*tax/100;
    int netSalary = basic - grossSalary;
    System.out.println("Net Salary after tax deduction: "+netSalary);
  }
}