/* Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.*/

import java.util.*;
public class Example2
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int n = sc.nextInt();
  
  int i = 1;
  while(n>=1)
  { 
    System.out.println(n);
    n--;
  }  
 }
}