import java.util.*;
public class Example13
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the weight: ");
   int w = sc.nextInt();
   
   if(w==0)
     {
      System.out.println("Time Estimated: 0 minutes");
     }
   if(w<=2000)
     {
      System.out.println("Time Estimated: 25 minutes");
     }
   else if(w>2000 && w<=4000)
     {
      System.out.println("Time Estimated: 35 minutes");
     }
   else
     {      
      System.out.println("Time Estimated: 45 minutes");
     }
  }
}

