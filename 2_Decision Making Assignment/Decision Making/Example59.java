/* Q59. Write a program using switch that takes a number (1-4) and displays a season:
 1: Spring
 2: Summer
 3: Autumn
 4: Winter
Explanation:
 Simple switch with four cases and default for invalid input.
 */

import java.util.*;
public class Example59
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number (1-4)");
  int num = sc.nextInt();
  
  switch(num)
  {
    case 1:
     System.out.println("Spring");
	 break;
	case 2:
     System.out.println("Summer");
	 break;
	case 3:
     System.out.println("Autumn");
	 break;
	case 4:
     System.out.println("Winter");
	 break;
	 
	default:
	  System.out.println("Invalid Number");
   
  }
 }
}