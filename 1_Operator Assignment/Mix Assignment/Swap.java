//Q14. Write a java program swap two number using third variable.

import java.util.Scanner;
public class Swap
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter the first variable: ");
   int a = sc.nextInt();
   
   System.out.println("enter the second variable: ");
   int b = sc.nextInt();
   
   int temp = b;
   b = a;
   a = temp;
   
   
   System.out.println("After the swap: " +a+ "," +b);
   
  }
}