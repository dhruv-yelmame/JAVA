/*Q2. Write a Java program that takes an integer (1-7) as input and prints the corresponding day of the week using switch-case.*/

import java.util.*;
public class Example2
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number(1-7)");
  int num = sc.nextInt();
  
  switch(num)
  {
    case 1:
       System.out.println("Monday");
	   break;
	case 2:
       System.out.println("Tuesday");
	   break;
	case 3:
       System.out.println("Wednsday");
	   break;
	case 4:
       System.out.println("Thursday");
	   break;
	case 5:
       System.out.println("Friday");
	   break;
	case 6:
       System.out.println("Saturday");
	   break;
	case 7:
       System.out.println("Sunday");
	   break;
    
	default:
	   System.out.println("Invalid Selection");
  
  
  }
  
 }
}