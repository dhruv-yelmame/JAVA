//Q12. Write a java program to calculate the simple intrest. 

import java.util.Scanner;
public class SimpleInterest
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter the principal: ");
   int principal = sc.nextInt();

   System.out.println("enter the rate: ");
   int rate = sc.nextInt();
 
   System.out.println("enter the timePeriod in years: ");
   int time = sc.nextInt();
   
   int simpleInterest = (principal*rate*time)/100;
   System.out.println("The total interest is "+simpleInterest);
   
   int totalAmt = simpleInterest + principal;
   System.out.println("Total Amount after Interest is "+totalAmt);

  }
}