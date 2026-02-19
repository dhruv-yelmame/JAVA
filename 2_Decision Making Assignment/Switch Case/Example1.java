/*Q1. Write a Java program that takes two numbers and an operator (+, -, *, /) as input and performs the 
			corresponding operation using a switch-case statement.*/

import java.util.*;
public class Example1
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter your choice \n1.+ \n2.- \n3.* \n4./");
  int choice = sc.nextInt();
  System.out.println("enter the first number: ");
  int n1 = sc.nextInt();
  
  System.out.println("enter the second number: ");
  int n2 = sc.nextInt();
 
  switch(choice)
  {
   case 1:
        System.out.println("Addition: "+(n1+n2));
		break;
   case 2:
        System.out.println("Substraction: "+(n1-n2));
		break;
   case 3:
        System.out.println("Multiplication: "+(n1*n2));
		break;
   case 4:
        System.out.println("Division: "+(n1/n2));
		break;
	
	default:
	    System.out.println("Invalid input");
  }
 }
}
