import java.util.*;
public class Example15
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the year: ");
   int year = sc.nextInt();

   if((year % 400 == 0) || (year%4==0 && year % 100 != 0))
     {
      System.out.println(year+" it is leap year");
     }
   else
     {
      System.out.println(year+" it is not leap year"); 
     }
  }
}