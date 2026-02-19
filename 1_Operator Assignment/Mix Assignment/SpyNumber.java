/*
Q1. Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 
*/

import java.util.*;
public class SpyNumber
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the number: ");
   int num = sc.nextInt();

   int sum = (num/1000) + ((num/100)%10) + ((num/10)%10) + (num%10);
   int product = (num/1000) * ((num/100)%10) * ((num/10)%10) * (num%10);
/*
  if(sum == product)
    {
      System.out.println("Spy Number");
    }
  else
    {
     System.out.println("Not Spy Number");
    }
*/
   String msg = (sum == product)? "Spy Number":"Not Spy Number";
    System.out.println(msg);
   

  }
}