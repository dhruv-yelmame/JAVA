//Q22. Write a java program to check whether a number is palindrome or not. 


import java.util.Scanner;
public class Example22
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number: ");
 int num = sc.nextInt();
 
 int pal = num%10*100 + ((num/10)%10)*10 + num / 100;
 
 if(pal == num)
 {
	System.out.println("Palindrome");
 }
 else
 {
	System.out.println("Not-Palindrome");
 }
 
 }
}