import java.util.*;
public class Example8
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter the principle: ");
   double p = sc.nextDouble();
  
   System.out.println("enter the time: ");
   double t = sc.nextDouble();
   
   System.out.println("enter the interest rate: ");
   double r = sc.nextDouble();
  

   double ci = p * Math.pow((1+ (r/100.0)),(t));  
  
   System.out.println("Compound interest is: "+ci);

  }
}

