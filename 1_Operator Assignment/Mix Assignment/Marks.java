//Q11. Write a java program to enter marks of five subjects and calculate total marks and percentage.

import java.util.Scanner;
public class Marks
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter the marks of following subject:");
   System.out.println("PHYSICS: ");
   int phy = sc.nextInt();
   System.out.println("CHEMISTRY: ");
   int chem = sc.nextInt();
   System.out.println("MATHS: ");
   int math = sc.nextInt();
   System.out.println("BIOLOGY: ");
   int bio = sc.nextInt();
   System.out.println("ENGLISH: ");
   int eng = sc.nextInt();
   
   int totalMarks = phy+chem+math+bio+eng;
   float percentage = (totalMarks*100)/500;
   
   System.out.println("The Total Marks is: "+totalMarks);
   System.out.println("Toatal Percentage is: "+percentage);
   
  }
}