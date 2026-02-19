/*Q18. Write a java program to find the first and last digit of a number.*/

import java.util.*;
public class Example18
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int num = sc.nextInt();//1234
  
  int lDigit=num%10;//1234%10=4
  int fDigit=num;
  while(fDigit>=10)//1234>=10,123>=10,12>=10,1>=10
  {
    fDigit=fDigit/10;//1234/10=123,123/10=12,12/10=1
  }
  System.out.println("First Digit: "+fDigit);
  System.out.println("Last Digit: "+lDigit);
  
 }
}