/*Q 5. Write a java program to enter radius of a circle and find its diameter,area and circumference.
Formula :-
diameter=2 * radius;circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;
*/
import java.util.Scanner;
public class Calcu
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);

   System.out.println("enter the radius: ");
   float radius = sc.nextFloat();

   float area =(float) 3.14 * radius * radius;
   System.out.println("The Area is "+area);

   float diameter =(float) 2.0*radius;
   System.out.println("The Diameter is "+diameter);
   
   float circumference =(float) (2.0 * 3.14 * radius);
   System.out.println("The Circumference is "+circumference);

  }
}
