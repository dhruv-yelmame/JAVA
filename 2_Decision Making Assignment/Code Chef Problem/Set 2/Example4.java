import java.util.*;
public class Example4
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the first side: ");
   int a = sc.nextInt();
   
   System.out.println("enter the second side: ");
   int b = sc.nextInt();
    
   int c = 180-(a+b);

   System.out.println("The third angle is "+c);
 
  }
}
