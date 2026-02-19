//Q16. Write a java program to find a minimum between three numbers.


import java.util.*;
public class Example16
{
 public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number 1: ");
 int num1 = sc.nextInt();
 System.out.println("enter the number 2: ");
 int num2 = sc.nextInt();
 System.out.println("enter the number 3: ");
 int num3 = sc.nextInt();

 
if(num1<num2 && num1<num3)
{
 System.out.println("The minimnum number is: "+num1);
}
else if(num2<num1 && num2<num3)
{
System.out.println("The minimnum number is: "+num2);
}
else
{
System.out.println("The minimnum number is: "+num3);
}

}
}