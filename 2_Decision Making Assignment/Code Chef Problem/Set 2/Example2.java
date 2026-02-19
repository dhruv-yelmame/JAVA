import java.util.*;
public class Example2
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the first side: ");
   int a = sc.nextInt();
   
   System.out.println("enter the second side: ");
   int b = sc.nextInt();
  
   System.out.println("enter the third side: ");
   int c = sc.nextInt();

   if(a+b==c)
     {
      System.out.println("The triangle is valid");
     }
   else
     {
      System.out.println("The triangle is not valid");
     }
  }
}