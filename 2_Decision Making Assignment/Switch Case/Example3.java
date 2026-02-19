/*Q3. Write a Java program that takes a single character as input and determines whether it is a vowel (a, e, i, o, u) or 
			a consonant using a switch-case statement.*/

import java.util.*;
public class Example3
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the character: ");
   char ch = sc.next().charAt(0);
   
   switch(ch)
   {
    case 'a','e','i','o','u':
	    System.out.println("Vowels");
		break;
	case 'A','E','I','O','U':
	    System.out.println("Vowels");
		break;
	
	default:
	    System.out.println("Consonant");
	
	
	
	    
   }
 }
}			

