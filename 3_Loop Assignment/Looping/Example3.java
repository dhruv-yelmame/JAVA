/*Q3. Write a java program to print all alphabets from a to z. - using while loop*/

import java.util.*;
public class Example3
{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter your character: ");
	 char ch = sc.next().charAt(0);
  
  while(ch<='z')
  {
    System.out.println(ch);
    ch++;
  }  
 }
}