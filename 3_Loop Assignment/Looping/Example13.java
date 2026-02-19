/* Q13. Write a java program to enter a number and print its reverse.*/

import java.util.*;
public class Example13
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int n = sc.nextInt();//123
  int i=1;
  int reverse = 0;
  while(n>0)//123>0,12>0,1>0,0>0
  {
   int lastDigit = n%10;//123%10=3, 12%10=2, 
   reverse = reverse * 10 + lastDigit; //3,2,1
   n = n/10;//12,1,0
  
  }
    System.out.println("Reverse Number: "+reverse);
 }
}