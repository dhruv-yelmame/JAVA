 /* Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                                	Basic Salary <= 10000 : HRA = 20%, DA = 80%
                                	Basic Salary <= 20000 : HRA = 25%, DA = 90%
                                	Basic Salary > 20000 : HRA = 30%, DA = 95%
 */

import java.util.*;
public class Example14
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the basic salary: ");
  double salary = sc.nextDouble();
 

  double hra = (salary<=10000)?(0.20*salary):(salary<=20000)?(0.25*salary):(0.30*salary);
  double da = (salary<=10000)?(0.80*salary):(salary<=20000)?(0.90*salary):(0.95*salary);

  double grossSalary = salary + hra + da;

  System.out.println("Basic Salary: "+salary);
  System.out.println("hra: "+hra);
  System.out.println("da: "+da);
  System.out.println("Gross Salary: "+grossSalary);

 }
}