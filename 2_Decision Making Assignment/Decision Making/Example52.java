/* Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
Explanation:
 Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.
 */

import java.util.*;
public class Example52
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
        System.out.println("Addition: "+(n1-n2));
		break;
   case 3:
        System.out.println("Addition: "+(n1*n2));
		break;
   case 4:
        System.out.println("Addition: "+(n1/n2));
		break;
	
	default:
	    System.out.println("Invalid input");
  }
 }
}
