/* Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.
 */

import java.util.*;
public class Example39
{
 public static void main(String x[])
 {
  int cmmAmt;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter sales amount: ");
  int sales = sc.nextInt();
  
  if(sales<5000)
  {
  cmmAmt = sales*2/100;
  System.out.println("commission amount:"+cmmAmt);
  }
  else if(sales>5000 && sales<10000)
  {
  cmmAmt = sales*5/100;
  System.out.println("commission amount:"+cmmAmt);
  }
  else if(sales>10000)
  {
  cmmAmt = sales*10/100;
  System.out.println("commission amount:"+cmmAmt);
  }
  else
  {
  System.out.println("No Commision");
  }
 }
}