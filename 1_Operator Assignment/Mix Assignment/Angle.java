//Q9. Write a java program to enter two angles of a triangle and find the third angle. 

import java.util.Scanner;
public class Angle
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
	
   System.out.println("enter the angle first: ");
   int ang1 = sc.nextInt();
   
   System.out.println("enter the angle second: ");
   int ang2 = sc.nextInt();
   
   int ang3 = 180 - (ang1 + ang2);
   System.out.println("Third angle is: "+ang3);
   
 }
}