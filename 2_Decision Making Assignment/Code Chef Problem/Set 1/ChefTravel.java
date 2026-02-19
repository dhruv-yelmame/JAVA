import java.util.*;
public class ChefTravel
{
  public static void main(String x1[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("price for A Cab Service:");
   int x = sc.nextInt();
   System.out.println("price for B Cab Service:");
   int y = sc.nextInt();
 

   if(x<y)
    {
     System.out.println("First");
    }
   else if(x>y) 
    {
     System.out.println("Second");
    }
   else
    {
     System.out.println("Any");
    }
  }
}
