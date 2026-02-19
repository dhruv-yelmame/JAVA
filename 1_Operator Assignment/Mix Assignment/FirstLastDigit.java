/*
Q54. Take a three-digit number and print the larger digit among first and last digit using ternary operator.
*/

import java.util.*;
public class FirstLastDigit
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter three digit number: ");
  int number = sc.nextInt();
  
  int lastDigit = number%10;
  int firstDigit = number/100;
  
  int msg = (firstDigit > lastDigit) ? firstDigit : lastDigit;
  System.out.println("Largest Number is: "+msg);

 }
}