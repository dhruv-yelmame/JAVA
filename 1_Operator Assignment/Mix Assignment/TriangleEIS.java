// Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 
import java.util.*;
public class TriangleEIS
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
 
 if(a==b && b==c)
 { 
    System.out.println("equilateral");
 }
 else if(a==b || b==c || c==a)
 {
	System.out.println("isoscale");
 }
 else
 {  
    System.out.println("scalene");
 }
 } 
}
