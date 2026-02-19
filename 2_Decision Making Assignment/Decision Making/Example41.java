/* Q41. Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.
 */

import java.util.*;
public class Example41
{
 public static void main(String x[])
 {
   int salary,service,rating,newSalary;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the basic salary: ");
   salary = sc.nextInt(); 
   
   System.out.println("enter the years of service: ");
   service = sc.nextInt(); 
   
   System.out.println("enter the rating(1-5): ");
   rating = sc.nextInt();

   if(rating>=4 && service>5)
    {
	newSalary = salary*20/100 + salary;
	System.out.println("New Salary: "+newSalary);
	}
   else if(rating>=3)
    {
    newSalary = salary*10/100 + salary;
	System.out.println("New Salary: "+newSalary);
    }
   else
    {
	newSalary = salary*5/100 + salary;
	System.out.println("New Salary: "+newSalary);
    }
   
 }
}