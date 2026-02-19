//Q4. Write a Java program to check whether a number is positive , negative or zero.


import java.util.*;
public class Example4
{
  public static void main(String x[])
  {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter the number: ");
  int num = sc.nextInt();
  
  if(num > 0)
  {
  System.out.println("Positive");
  }
  else if(num < 0)
  {
  System.out.println("Negative");
  }
  else if( num == 0)
  {
  System.out.println("Zero");
  }
  else
  {
  System.out.println("Invalid Choice! Please enter the number");
  }
  
  }
}