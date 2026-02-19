/* Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation:
 Use a char or string in switch to match grades and print remarks.
 */

import java.util.*;
public class Example53
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the grade (A, B, C, D, F): ");
  char ch = sc.next().charAt(0);
  
   switch(ch)
   {
    case 'A':
	     System.out.println("Excellent");
		 break;
    case 'B':
	     System.out.println("Good");
		 break;
    case 'C':
	     System.out.println("Average");
		 break;
	case 'D':
	     System.out.println("Poor");
		 break;
    case 'F':
	     System.out.println("Fail");
		 break;
    
	default:
	     System.out.println("Enter valid grade (A, B, C, D, F)");
   }
  
  
 }
}