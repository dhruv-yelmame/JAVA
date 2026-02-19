/* Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.
 */

import java.util.*;
public class Example35
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the age: ");
   int age = sc.nextInt();
   
   if(age<7)
   {
   System.out.println("child");
   }
   else if(age<18)
   {
   System.out.println("teenager");
   }
   else if(age>=18 && age<60)
   {
   System.out.println("adult");
   }
   else
   {
   System.out.println("senior");
   }
   
  }
}
