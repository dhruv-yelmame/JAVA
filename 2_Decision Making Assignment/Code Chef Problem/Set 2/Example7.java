import java.util.*;
public class Example7
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter the principle: ");
   float p = sc.nextFloat();
  
   System.out.println("enter the time: ");
   float t = sc.nextFloat();
   
   System.out.println("enter the interest rate: ");
   float r = sc.nextFloat();
  
   float si = (p*t*r)/100;
   System.out.println("Simple interest is: "+si);
  }
}