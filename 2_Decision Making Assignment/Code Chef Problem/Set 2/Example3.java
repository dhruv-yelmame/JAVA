import java.util.*;
public class Example3
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

    if(a==b && b==c)
      {
       System.out.println("Triangle is equilateral triangle");
      }
    else if(a==b || b==c || c==a)
      {
       System.out.println("Triangle is isosceles triangle");
      }
    else
      {
       System.out.println("Triangle is scalene triangle");
      }

   }
}
