//Q31. Write a Java program to check whether a number is even or odd. 

import java.util.*;
public class EOAPP
{
  public static void main(String x[])
  {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter the number :");
  int num = sc.nextInt();
  if(num%2 == 0)
  {
	  System.out.println("The number is even");
  }
  else
  {
	  System.out.println("The number is odd");
  }
  }
}
