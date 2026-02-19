import java.util.*;
public class Example5
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter first number: ");
   double a = sc.nextDouble();
  
   System.out.println("enter second number: ");
   double b = sc.nextDouble();

   System.out.println("enter third number: ");
   double c = sc.nextDouble();
    
   double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Root1: %.2f\nRoot2: %.2f\n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root1 = Root2: %.2f\n", root);
        } else {
            System.out.println("No Real Roots (Complex roots exist)");
        }
   
  }
}