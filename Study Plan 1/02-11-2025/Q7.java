//Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.


import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the cost price: ");
		double cp = sc.nextDouble();
		System.out.print("enter the selling price: ");
		double sp = sc.nextDouble();
		
		if(sp>cp)
			System.out.print("profit");
		else if(sp==cp)
			System.out.print("no profit / no loss");
		else
			System.out.print("loss");
	}
}