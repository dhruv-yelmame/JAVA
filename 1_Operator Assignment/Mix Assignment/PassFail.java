//Q8. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.

import java.util.*;
public class PassFail
{
 public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the score: ");
 int score = sc.nextInt();

if(score>=40)
{
  System.out.println("Pass");
}
else
{
  System.out.println("Fail");
}
}
}