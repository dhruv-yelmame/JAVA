/*
Q5. Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.
Input: 15
Output: Multiple of both 3 and 5
*/

import java.util.*;
public class CheckMulOperator
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the number: ");
  
   double num = sc.nextDouble();
    
if((num%3 == 0) && (num%5 == 0))
    {
      System.out.println("Multiple of both 3 and 5"); 
    }
   else 
    {
      System.out.println("Not Multiple of both 3 and 5");
    }
  }
}