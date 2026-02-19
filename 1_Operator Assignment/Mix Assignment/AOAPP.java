//Q 3. Write a java program to enter two numbers and perform all arithmetic operations. 

import java.util.Scanner;
public class AOAPP
{

  public static void main(String x[])
   {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("enter your first number: ");
        int a = sc.nextInt();

        System.out.println("enter your second number: ");
        int b = sc.nextInt();
        
        int add = a + b;
        int sub = a - b;
        int mul = a*b;
        double div = (double)a/b;

        System.out.println("The addition of "+ a + " & " + b + " is "+add);
        System.out.println("The substraction of "+ a + " & " + b + " is "+sub);
        System.out.println("The multiplication of "+ a + " & " + b + " is "+mul);
        System.out.println("The division of "+ a + " & " + b + " is "+div);

   }

}