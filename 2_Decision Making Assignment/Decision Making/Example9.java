//Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.


import java.util.*;
public class Example9
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the character: ");
  char c = sc.next().charAt(0);
  
  if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' || c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U')
  {
  System.out.println("It is a vowel");
  }
  else
  {
  System.out.println("It is a consonant");
  }
 }
}