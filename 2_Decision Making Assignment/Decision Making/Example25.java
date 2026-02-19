/* Q25.Write a java program to find the total number of notes in a given amount.  
                    	
            Enter the amount: 2528
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
 */

import java.util.*;
public class Example25
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the amount: ");
   int amt = sc.nextInt();
   
   int fiveHund = amt/500;
   amt = amt%500;
   
   int hund = amt/100;
   amt = amt%100;
   
   int fifty = amt/50;
   amt = amt%50;
   
   int twenty = amt/20;
   amt = amt%20;
   
   int ten = amt/10;
   amt = amt%10;
   
   int five = amt/5;
   amt = amt%5;
   
   int two = amt/2;
   amt = amt%2;
   
   int one = amt/1;
   amt = amt%1;
   
   
   System.out.println("500:"+fiveHund);
   System.out.println("100:"+hund);
   System.out.println("50:"+fifty);
   System.out.println("20:"+twenty);
   System.out.println("10:"+ten);
   System.out.println("5:"+five);
   System.out.println("2:"+two);
   System.out.println("1:"+one);
 
  }
}