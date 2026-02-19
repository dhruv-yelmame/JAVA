/*Q11. Create a class Product with:
Fields: productId, name, price, category

Constructors:
Default constructor (assign temporary values)
Parameterized constructor (assign all fields)
Task Logic:
Write a method getFinalPrice() that applies:

if category = "Electronics" → 18% GST + 10% discount
if category = "Clothing" → 5% GST + 20% discount
otherwise → only 5% GST

Create 3 objects using all three constructors and find the final price for each.
Expected Learning: Constructor chaining + conditional logic.
*/

import java.util.*;
class Product
{
	private int productId;
	private String name;
	private int price;
	private String category;
	Product()
	{
		productId=12;
		name="dh";
		price=45;
		category="Clothing";
	}
	
	Product(int productId,String name,int price,String category)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.category=category;
	}
	
	void getFinalPrice()
	{
		if(category.equals("Electronics"))
		{
			double gst = price*18/100;
			double dis = price*10/100; 
			double finalprice = price + gst - dis;
			System.out.println("Final Price: "+finalprice);
		}
		else if(category.equals("Clothing"))
		{
			double gst = price*5/100;
			double dis = price*20/100; 
			double finalprice = price + gst - dis;
			System.out.println("Final Price: "+finalprice);
		}
		else
		{
			double gst = price*5/100;
			double finalprice = price + gst;
			System.out.println("Final Price: "+finalprice);
		}
		
	}
}

public class Q11
{
	public static void main(String x[])
	{
		Product p1 = new Product();
		Product p2 = new Product(1,"Dhruv",400,"Electronics");
		Product p3 = new Product(2,"Shri",100,"Clothing");
		
		p1.getFinalPrice();
		p2.getFinalPrice();
		p3.getFinalPrice();
	}
}