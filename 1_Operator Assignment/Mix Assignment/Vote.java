//Q2. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

import java.util.*;
public class Vote
{
 public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the age: ");
 int age = sc.nextInt();
 
 if(age >=18)
 {
  System.out.println("You are eligible to vote");
 }
 else
 {
  System.out.println("You are not eligible to vote");
 }
}
}