//Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.


import java.util.*;
public class Example20
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  int num = sc.nextInt();
  int sqr = (int)Math.sqrt(num);
  
  if(sqr*sqr==num)
  {
    System.out.println("Perfect Square");
  }
  else
  {
	System.out.println("Not Perfect Square");  
  }
  
 }
 
}