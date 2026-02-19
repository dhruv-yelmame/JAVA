import java.util.*;
public class Example6
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("electricity unit: ");
   double uc = sc.nextDouble();

   
   if(uc<=50)
     {
      double a = uc*0.50;
      double total1 = a + a*20/100;
      System.out.println("Total Electricity Bill is "+total1);
     }
   else if(uc>50 && uc<=150)
     {
      double b = uc*0.75;
      double total2 = b + b*20/100;
      System.out.println("Total Electricity Bill is "+total2);
     }
   else if(uc>150 && uc<=250)
     {
      double c = uc*1.20;   
      double total3 = c + c*20/100;
      System.out.println("Total Electricity Bill is "+total3);
     }
   else
     {
      double d = uc*1.50;
      double total4 = d + d*20/100;
      System.out.println("Total Electricity Bill is "+total4);
     }
  }
}