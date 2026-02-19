/*
Q51
Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not.
Example Input:
m = 25, n = 12
*/

import java.util.*;
public class DiffGreater
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);

   System.out.println("enter the first number: ");
   int m = sc.nextInt();
  
   System.out.println("enter the second number: ");
   int n = sc.nextInt();
   
   String dif =(m-n>=10)?"Greater than 10":"Not Greater than 10";
   System.out.println(dif);
 }
}