//Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.


import java.util.*;
public class Example10
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the input: ");
  char input = sc.next().charAt(0);
  
  if(input>='a' && input<='z')
  {
    System.out.println("Alphabet");

  }
  else if(input>=0 || input<=0)
  {
    System.out.println("Digit");

  }
  else
  {
    System.out.println("Special Character");
  }
  
 }
}