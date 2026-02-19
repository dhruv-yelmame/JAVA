/*
Q4. Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
*/

import java.util.*;
public class QR
{
public static void main(String x[])
{
 int dividend,divisor,quotient,remainder;
 
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the dividend: ");
 dividend = sc.nextInt();

 System.out.println("enter the divisor: ");
 divisor = sc.nextInt(); 
 
 quotient = dividend/divisor;
 remainder = dividend%divisor;

 System.out.println("Quotient: "+quotient);
 System.out.println("Remainder: "+remainder);

}
}