//Q25. Write a java program to check whether number is palindrome or not. 

import java.util.Scanner;
public class Palindrome
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number: ");
 int num = sc.nextInt();
 
 int pal = num%10*100 + ((num/10)%10)*10 + num / 100;
 String res = (pal == num )? "Palindrome" : "Not - Palindrome";
 System.out.println(res);
 
 }
}