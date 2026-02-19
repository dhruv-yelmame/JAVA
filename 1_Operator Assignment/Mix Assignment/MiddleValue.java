/*
Q52. Problem:
Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r.
Example Input:
p = 10, q = 20, r = 15
*/

import java.util.*;
public class MiddleValue
{
  public static void main(String x[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the p: ");
  int p = sc.nextInt();//9
  
  System.out.println("enter the q: ");
  int q = sc.nextInt();//5

  System.out.println("enter the r: ");
  int r = sc.nextInt();//8
   
  int middle = ((p>q)&&(p<r))?p:((q>p)&&(q<r))?q:r;
 
   
  System.out.println("Middle Value: "+middle);

}
}