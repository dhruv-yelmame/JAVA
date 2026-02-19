//Q23. Write a java program to Check Number Is Spy Number or Not.


import java.util.*;
public class Example23
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the number: ");
   int num = sc.nextInt();

   int sum = (num/1000) + ((num/100)%10) + ((num/10)%10) + (num%10);
   int product = (num/1000) * ((num/100)%10) * ((num/10)%10) * (num%10);

  if(sum == product)
    {
      System.out.println("Spy Number");
    }
  else
    {
     System.out.println("Not Spy Number");
    }
   

  }
}