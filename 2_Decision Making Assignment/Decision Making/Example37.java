/* Q37. Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.
 */

import java.util.*;
public class Example37
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the month number: ");
  int month = sc.nextInt();
  
  if(month>=1 && month<=3)
  {
  System.out.println("Spring");
  }
  else if(month>=4 && month<=6)
  {
  System.out.println("Summer");
  }
  else if(month>=7 && month<=9)
  {
  System.out.println("Winter");
  }
  else if(month>=10 && month<=12)
  {
  System.out.println("Autumn");
  }
  else
  {
  System.out.println("Invalid!");
  }
 }
}