/* Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.
 */

import java.util.*;
public class Example36
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number 1: ");
  int n1 = sc.nextInt();
  System.out.println("enter the number 2: ");
  int n2 = sc.nextInt();
  
  if(n1>n2)
  {
  System.out.println("N1 is Greater");
  }
  else if(n1<n2)
  {
  System.out.println("N1 is Smaller");
  }
  else
  {
  System.out.println("Equal");
  }
  

 }
}