/*Q9. Write a java program to print a multiplication table of any number.
*/

import java.util.*;
public class Example9
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int n = sc.nextInt();
  
  int i = 1;
  while(i<=10)
  {
   int tab=n*i;
   i++; 
   System.out.println(tab);
    
  }
 }
}