/* Q55. Write a program to input a character and check whether it is a vowel or consonant using a switch case.
Explanation:
 Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.
 */

import java.util.*;
public class Example55
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
   default:
       System.out.println("Consonant");
  }
  
 }
}