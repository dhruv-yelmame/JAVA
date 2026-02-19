/*Q21. Write a Java program to reverse a number without using loop.
Input a number: 123 Reverse number: 321
*/
import java.util.Scanner;
public class Reverse
{
  public static void main(String x[])
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int no = sc.nextInt();
  System.out.println("Before Reverse Number is: "+no);
  no = (no%10)*100 + ((no/10)%10)*10 + no/100;
  System.out.println("After Reverse Number is: "+no);
  } 
}
