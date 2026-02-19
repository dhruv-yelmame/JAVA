/*Q 4. Write a java program to enter length and breadth of a rectangle and find its area.
Formula - area= length * breadth;
*/
import java.util.Scanner;
public class Area
{
 public static void main(String x[])
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter the length: ");
      int len = sc.nextInt();

      System.out.println("enter the breadth: ");
      int bre = sc.nextInt();
      
      int totalArea = len*bre;
      System.out.println("The total area is "+totalArea);

   }
}