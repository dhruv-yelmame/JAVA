/*Q17. Write a java program to find all factors of a number.*/

import java.util.*;
public class Example17
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int n = sc.nextInt();//6

  for(int i=1; i<n; i++)
  {
	  if(n%i==0)
		  System.out.print(i+" ");
		  
  }
 }
}