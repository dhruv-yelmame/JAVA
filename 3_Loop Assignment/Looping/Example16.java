 /*Q16. Write a java program to find power of a number.*/

import java.util.*;
public class Example16
{
 public static void main(String x[])
 {
  int p=1;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int num = sc.nextInt();//5
  
  System.out.println("enter the power: ");
  int pow = sc.nextInt();//3
  
  int i=1;
  while(i<=pow)//1<=3, 2<=3, 3<=3, 4<=3
  {
   p = p * num; // 1*5=5, 5*5=25, 25*5=125
   i++;//2, 3, 4
  }
  System.out.println("Power is: "+p);
  
 }
}