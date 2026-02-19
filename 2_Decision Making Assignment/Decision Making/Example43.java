/* Q43. Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.
 */

import java.util.*;
public class Example43
{
 public static void main(String x[])
 {
  int fine,days;
  Scanner sc = new Scanner(System.in);
  System.out.println("Number of days late: ");
  days = sc.nextInt();
  
  if(days>=0 && days<=5)
  {
  fine = days*2;
  System.out.println("Total fine: "+fine);
  System.out.println("Membership Status:actives");
  }
  else if(days>=6 && days<=10)
  {
  fine = days*3;
  System.out.println("Total fine: "+fine);
  System.out.println("Membership Status:active");
  }
  else if(days>=11 && days<=30)
  {
  fine = days*5;
  System.out.println("Total fine: "+fine);
  System.out.println("Membership Status:Membership active");
  }
  else
  {
  fine = days*5 + 500;
  System.out.println("Total fine: "+fine);
  System.out.println("Membership Status:Membership canceled");
  }
 }
}
