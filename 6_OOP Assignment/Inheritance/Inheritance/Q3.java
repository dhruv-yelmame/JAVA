/*3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.
*/

class Product
{
	int id;
	String name;
	int price;
	Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	int getFinalPrice()
	{
		return price;
	}
}

class Electronics extends Product
{
	Electronics(int id,String name,int price)
	{
		super(id,name,price);
	}
	
	int getFinalPrice()
	{
		int dis = price*10/100;
		return price-dis;
	}
}
class Clothing extends Product
{
	Clothing(int id,String name,int price)
	{
		super(id,name,price);
	}
	
	int getFinalPrice()
	{
		int dis = price*5/100;
		return price-dis;
	}
}
public class Q3
{
	public static void main(String x[])
	{
		Product p = null;
		p = new Electronics(1,"Dhruv",500);
	
		int res = p.getFinalPrice();
		System.out.println("Electronics: "+res);
		
		p = new Clothing(2,"Ram",150);
		res = p.getFinalPrice();
		System.out.println("Clothing: "+res);
	}
}