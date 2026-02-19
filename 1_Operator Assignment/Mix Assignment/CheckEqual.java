//Q3. Write a java program to accept two integers and check whether they are equal or not.

import java.util.*;
public class CheckEqual
{
 public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the first number: ");
 int num1 = sc.nextInt();
 System.out.println("enter the second number: ");
 int num2 = sc.nextInt();
 if(num1 == num2)
  {
    System.out.println("Equal");
  }
 else
  {
    System.out.println("Not Equal");
  }
}
}