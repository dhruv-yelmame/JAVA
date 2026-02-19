//prompt $g - reduce path in cmd

import java.util.*;
public class Example11
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   int t,f,v,w;
   System.out.println("enter total number of vehicles: ");
   v = sc.nextInt();
  
   System.out.println("enter total number of wheels: ");
   w = sc.nextInt();
   
    
   f = (w/2)-v;
   t = v-f;
   
   System.out.println("TV: "+t);
   System.out.println("TW: "+f);
   
  }
}

