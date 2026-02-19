/*
Q3. Write a Java program to calculate the net salary of an employee.
Input: basic salary, HRA %, DA %, and tax %.
*/
import java.util.*;
public class SalaryEmp
{
 public static void main(String x[])
 {
   int salary,hra,da,tax;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the basic salary: ");
   salary = sc.nextInt();
   
   System.out.println("enter the hra: ");
   hra = sc.nextInt();

   System.out.println("enter the da: ");
   da = sc.nextInt();

   System.out.println("enter the tax: ");
   tax = sc.nextInt();

   int grossSalary = salary + salary*hra/100 + salary*da/100;
   int netSalary = grossSalary - grossSalary*tax/100;
    
   System.out.println("Total NetSalary: "+netSalary);
 
 }
}