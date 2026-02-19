/*Q6. Write a java program to find the sum of all natural numbers between 1 to n.*/

import java.util.*;
public class Example6
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int n = sc.nextInt();
  int sum=0;
  int i=1;
  while(i<=n)
  {
    sum +=i;
    i++;
  }  
  System.out.println("Sum: "+sum);
 }
}