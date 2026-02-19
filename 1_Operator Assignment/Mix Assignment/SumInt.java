/*Q20. Write a Java program and compute the sum of an integer's digits.
Input : 123
Output : 6
*/

import java.util.Scanner;
public class SumInt
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int num = sc.nextInt();
  
  int sum = (num/1000) + ((num/100)%10) + ((num/10)%10) + (num%10);
  System.out.println("The sum of integer: "+sum);
  
 }
}