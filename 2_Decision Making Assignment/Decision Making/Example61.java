/* Q61. Write a menu-driven program in java using switch case.
           	1.Addition
           	2.Subtraction
           	3.Multiplication
           	4.Division
 */
 
import java.util.*;
public class Example61
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the choice	\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
  int choice = sc.nextInt();
  
  System.out.println("enter the two number: ");
  int a = sc.nextInt();
  int b = sc.nextInt();
  
  switch(choice)
  {
   case 1:
    System.out.println("Addition: "+(a+b));
	break;
   case 2:
    System.out.println("Subtraction: "+(a-b));
	break;
   case 3:
    System.out.println("Multiplication: "+(a*b));
	break;
   case 4:
    System.out.println("Division: "+(a/b));
	break;
	  
  }
  
 }
}