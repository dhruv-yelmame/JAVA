import java.util.*;
public class Example12
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   int n = 10;
   int k = 5;
   System.out.println("enter the number of candies u want: ");
   int c = sc.nextInt();
   
   int ca = n-c;
  
   if(c>0 || c<=5)
     {
      System.out.println("NUMBER OF CANDIES SOLD: "+c);
      System.out.println("NUMBER OF CANDIES AVAILABLE: "+ca);
     }
   else
     {
     System.out.println("INVALID INPUT");
     System.out.println("NUMBER OF CANDIES AVAILABLE: "+ca);
     }
  }
}