//Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.


import java.util.*;
public class Example24
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
   System.out.println("enter the character: ");
   char c = sc.next().charAt(0);
   
   if(c>='a' && c<='z')
   {
    System.out.println("Character is Lowecase");
   }
   else if(c>='A' && c<='Z')
   {
	   System.out.println("Character is Uppercase");
   }
   else
   {
    System.out.println("Invalid Character");
   }
   
 }
}