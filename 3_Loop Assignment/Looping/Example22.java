/*Q22. Write a java program to Check Number Is Perfect Number or Not.*/
// perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.

import java.util.*;
public class Example22
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int n = sc.nextInt();//6
  
  int i=1,sum=0;
  
  //perfect number
  while(i<n)//1<=6,2<=6,3<=6,4<=6,5<=6,6<=6
  {
	  //find factorial
    if(n%i==0)//6%1==0,6%2==0,6%3==0,6%4==0,6%5==0
     {
      sum=sum+i;//0+1=1,1+2=3,3+3=6
     }
    i++;
  }
  
  if(sum==n)
  {
	System.out.println("Perfect Number");  
  }
  else
  {
    System.out.println("Not Perfect Number");
  }
 }
}