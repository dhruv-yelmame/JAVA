/*Q12. Write a java program to calculate the product of digits in a number.*/

import java.util.*;
public class Example12
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int n = sc.nextInt();//123
  int product=1;
  int rem;
  while(n>0)//123>0, 12>0, , 1>0,0>0
  {
   rem = n%10;//3, 2,1
   n=n/10;//12, 1,0
   product=product*rem;//1*3=3,3*2=6,6*1=6
  }
  System.out.println("Product: "+product);
 }
}
