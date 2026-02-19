/* Q54. Develop a Java program using switch to print the day type for an input day number (1-7):
1 for Monday, …, 7 for Sunday.
For 1-5, display “Weekday”; for 6-7, display “Weekend”.
 */

import java.util.*;
public class Example54
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the input day number(1-7): ");
  int day = sc.nextInt();
  
  switch(day)
  {
   case 1:
   case 2:
   case 3:
   case 4:
   case 5:
       System.out.println("Weekday");
	   break;
   case 6:
   case 7:
       System.out.println("Weekend");
	   break;
	default:
	   System.out.println("Invalid Input");
  }
 }
}