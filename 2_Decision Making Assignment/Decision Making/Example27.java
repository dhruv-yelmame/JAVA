/* Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F	
 */

import java.util.*;
public class Example27
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
   System.out.println("COMPUTER: ");
   int eng = sc.nextInt();
   
   int totalMarks = phy+chem+math+bio+eng;
   float percentage = (totalMarks*100)/500;
   
   System.out.println("Total Percentage: "+percentage);

   
   if(percentage >= 90)
   {
    System.out.println("Grade A");
   }
   else if(percentage >= 80)
   {
   System.out.println("Grade B");
   }
   else if(percentage >= 70)
   {
   System.out.println("Grade C");
   }
   else if(percentage >= 60)
   {
   System.out.println("Grade D");
   }
   else if(percentage >= 40)
   {
   System.out.println("Grade E");
   }
   else
   {
   System.out.println("Grade F");
   }
  
   
  }
}