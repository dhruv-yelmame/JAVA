/*Q2. Create a Product class having fields productName and price.
 Initialize using a constructor.
 Write a method isDiscountEligible() that returns true if price > 500, else false.
 In main, print which products get discount.
Concepts Used:
 ✔ Constructor to set values
 ✔ Logical operator (>)
 ✔ Returning boolean
Explanation:
 Constructor loads product values; logical check decides discount eligibility.
*/

class Product
{
	private String productName;
	private int price;
	
	Product(String productName,int price)
	{
		this.productName=productName;
		this.price=price;
	}
	
	boolean isDiscountEligible()
	{
		if(price > 500)
			return true;
		else
			return false;
	}
}

public class Q2
{
	public static void main(String x[])
	{
		Product p1 = new Product("Soap",255);
		Product p2 = new Product("Pro",555);
		
		System.out.println(p1.isDiscountEligible());
		System.out.println(p2.isDiscountEligible());
		
	}
}