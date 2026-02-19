/* Q34. Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.
 */

import java.util.*;
public class Example34
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("enter years of service: ");
	int service = sc.nextInt();
    
	
	if(service>5)
	{
	System.out.println("enter the salary: ");
	int salary = sc.nextInt();
    int bonus = salary*5/100;
	System.out.println("Bonus Amount: "+bonus);
	}
	else
	{
	System.out.println("No Bonus");
	}  	
  }
}