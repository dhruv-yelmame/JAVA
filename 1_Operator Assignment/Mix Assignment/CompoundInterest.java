//Q13. Write a java program to calculate the compound intrest.

import java.util.Scanner;
import java.lang.*;
public class CompoundInterest
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter the principal: ");
   double principal = sc.nextDouble();

   System.out.println("enter the rate: ");
   double rate = sc.nextDouble();
 
   System.out.println("enter the timePeriod in years: ");
   double time = sc.nextDouble();
    
   System.out.println("enter no of times interest per years: ");
   double timeInt = sc.nextDouble();
   
   double finalAmount = principal * Math.pow((1+ (rate/100.0)/timeInt),(timeInt*time));
   
   double compoundInterest = finalAmount - principal;
   
   System.out.println("The total interest is: "+compoundInterest);
   System.out.println("Total Amount after Interest is "+finalAmount);

  }
}