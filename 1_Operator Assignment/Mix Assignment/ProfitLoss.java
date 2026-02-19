//Q37. Write a Java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;
public class ProfitLoss
{
 public static void main(String x[])
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the cost price: ");
	int cost = sc.nextInt();
	
	System.out.println("enter the selling price: ");
	int sell = sc.nextInt();
	
	if(cost > sell)
	{
	System.out.println("Loss");
	}
	else
	{
	System.out.println("Profit");
	}
	
   
 }
}