//Q5. Write a java program to find the minimum between two numbers. 
import java.util.*;
public class MinNum
{
 public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number 1: ");
 int num1 = sc.nextInt();
 System.out.println("enter the number 2: ");
 int num2 = sc.nextInt();
 
if(num1<num2)
{
 System.out.println("The minimnum number is: "+num1);
}
else
{
System.out.println("The minimnum number is: "+num2);
}
}
}