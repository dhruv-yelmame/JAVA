/*Q14. Write a java program to check whether a number is palindrome or not.*/
import java.util.*;
public class Example14
{
 public static void main(String x[])
 {
  int sum,rem=0;
  int reverse=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int n = sc.nextInt();//151
 
  int temp = n;
  while(temp!=0)//151!=0,15!=0,1!=0
  { 
    rem = temp%10;//1,5,1
    temp = temp/10;//5,1,1
	reverse = reverse*10 + rem;
  }
  if(n == reverse)
  {
   System.out.println("Palindrome");
  }
  else
  {
   System.out.println("Not Palindrome");
  }
	
 }
}