//Q7. Write a java program to find the maximum between two numbers.

import java.util.*;
public class MaxTwoNum
{
 public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number 1: ");
 int num1 = sc.nextInt();
 System.out.println("enter the number 2: ");
 int num2 = sc.nextInt();
 
if(num1>num2)
{
 System.out.println("The maximum number is: "+num1);
}
else
{
System.out.println("The maximum number is: "+num2);
}
}
}