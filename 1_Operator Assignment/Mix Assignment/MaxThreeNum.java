//Q1. Write a java program to find maximum between three numbers.

import java.util.*;

public class MaxThreeNum
{
 public static void main(String x[])
{
 int n1,n2,n3;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the first number: ");
 n1 = sc.nextInt();
 System.out.println("enter the second number: ");
 n2 = sc.nextInt();
 System.out.println("enter the third number: ");
 n3 = sc.nextInt();

if(n1>n2 && n1>n3)
{
System.out.println("The maxumum number is: "+n1);
}
else if(n2>n3 && n2>n1)
{
System.out.println("The maxumum number is: "+n2);
}
else
{
System.out.println("The maxumum number is: "+n3);
}
}
}