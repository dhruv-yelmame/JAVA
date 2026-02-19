//Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.


import java.util.*;
public class Example19
{
 public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the score out of 100: ");
 int score = sc.nextInt();
 
  if(score>=90)
  {
	System.out.println("Excellent");
  }
  else if(score>=75)
  {
	System.out.println("Good");
  }
  else if(score>=50)
  {
    System.out.println("Average");
  }
  else
  {
	System.out.println("Poor");
  }
	
}
}