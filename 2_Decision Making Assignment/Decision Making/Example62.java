/* Q62. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers.
 */

import java.util.*;
public class Example62
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter your choice: \n1.Check Number is positive, negative or zero. \n2.Check Number is even or odd. \n3.find the max number using 2 numbers.");
    int choice = sc.nextInt();
	
	switch(choice)
	{
	case 1:
	System.out.println("Enter the Number:");
	int a = sc.nextInt();
	  if(a>0)
	  {
	  System.out.println("Positive");
	  }
	  else if(a<0)
	  {
	  System.out.println("Negative");
	  }
	  else
	  {
	  System.out.println("Zero");
	  }
	  break;
	  
	case 2:
	System.out.println("Enter the Number:");
	int a1 = sc.nextInt();
	  if(a1%2==0)
	  {
	  System.out.println("Even");
	  }
	  else
	  {
	  System.out.println("Odd");
	  }
	  break;
	  
	case 3:
	System.out.println("Enter the first Number:");
	int a2 = sc.nextInt();
	
	System.out.println("Enter the second Number:");
	int b = sc.nextInt();
	
	if(a2>b)
	  {
	  System.out.println("Max Number: "+a2);
	  }
	  else
	  {
	  System.out.println("Max Number: "+b);
	  }
	  break;
    
	default:
	  System.out.println("Invalid Selection");
	}
					  
 }
}