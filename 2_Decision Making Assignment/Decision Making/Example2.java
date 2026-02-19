//Q2. Write a Java program to check whether a triangle is valid or not.


import java.util.*;
public class Example2
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter the side a: ");
  double a = sc.nextDouble();
  
  System.out.println("enter the side b: ");
  double b = sc.nextDouble();
  
  System.out.println("enter the side c: ");
  double c = sc.nextDouble();
  
  if ( a + b > c && b + c > a && a + c > b)
  {
    System.out.println("Triangle is valid");
  }
  else
  {
    System.out.println("Triangle is not valid");
  }
 
 }
}