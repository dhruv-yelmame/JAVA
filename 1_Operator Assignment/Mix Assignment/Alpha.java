//Q36. Write a Java program to check whether character is alphabetic or not.

import java.util.*;
public class Alpha
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the character: ");
   char msg = sc.next().charAt(0);
   
   if(msg>='a' && msg<='z' || msg>='A' && msg<='Z')
   {
	System.out.println("it is alphabetical character");
   }
   else
   {
	System.out.println("it is not alphabetical character");
   }
  }
}