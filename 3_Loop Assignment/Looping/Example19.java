/*Q19. Write a java program to find the sum of the first and last digit of a number.*/

import java.util.*;
public class Example19
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int num = sc.nextInt();
  
  int lDigit=num%10;
  int fDigit=num;
  while(fDigit>=10)
  {
    fDigit=fDigit/10;	
  }
  int sum = fDigit+lDigit;
  System.out.println("Sum of First & Last Digit: "+sum);
  
 }
}