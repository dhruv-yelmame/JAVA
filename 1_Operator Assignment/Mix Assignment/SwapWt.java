//Q15. Write a java program swap two number without using third variable. 

import java.util.Scanner;
public class SwapWt
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter the first variable: ");
   int a = sc.nextInt();
   
   System.out.println("enter the second variable: ");
   int b = sc.nextInt();
   
   a = a + b;
   b = a - b;
   a = a - b;
   
   System.out.println("After the swap: " +a+ "," +b);
   
  }
}