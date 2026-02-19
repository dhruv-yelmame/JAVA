/*
Q55. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.
Example:
Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater
Input: num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater
*/

import java.util.*;
public class MiddleDigitGreater
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the first digit number: ");
   int num = sc.nextInt();
   
   int firstDigit = num/100;
   int midDigit = (num/10)%10;
   int lastDigit = num%10;

   String msg =(midDigit > (firstDigit+lastDigit))?"Greater":(midDigit == (firstDigit+lastDigit))?"Equal":"Not Greater";
   System.out.println(msg);

  }
}