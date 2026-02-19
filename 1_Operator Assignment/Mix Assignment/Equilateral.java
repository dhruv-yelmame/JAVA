//Q10. Write a java program to calculate area of an equilateral triangle.

import java.util.Scanner;
import java.lang.Math;
public class Equilateral 
{
  public static void main(String x[])
  {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter the side of triangle: ");
  double side = sc.nextDouble();
  
  double area = (double)(Math.sqrt(3)/ (4) * Math.pow(side, 2));
  System.out.println("The area of Equilateral Trianle is: "+area);
  }
}