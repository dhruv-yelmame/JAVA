/*Q10. Write a java program to count the number of digits in a number.*/

import java.util.*;
public class Example10
{
 public static void main(String x[])
 {
  int n,count=0; 
  Scanner sc = new Scanner(System.in);
  System.out.println("enter your number: ");
  n = sc.nextInt();
  
  while(n!=0)
  {
    n = n/10;
	++count;
  }
  System.out.println("Count is: "+count);
  
 }
}