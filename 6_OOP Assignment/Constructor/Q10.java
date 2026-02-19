/*Q10. Create a Product class with:
productName
stock
Use a constructor to set values.
 Create an array of 15 products.
 Write a method to count how many products have stock < 10.
Concepts Used:
 ✔ Constructor
 ✔ Array of objects
 ✔ Logical condition (stock < 10)
 ✔ Counter variable
Explanation:
 Loop through array, apply condition, increment count.
*/

import java.util.*;
class Product
{
	private String productName;
	private int stock;
	int count = 0;
	 
	Product(String productName,int stock)
	{
		this.productName=productName;
		this.stock=stock;	 
	}
	
	String getProductName()
	{
		return productName;
	}
	int getStock()
	{
		return stock;
	}
	
}

class ProductDisplay
{
	void display(Product p[])
	{
		int count = 0;
		for(int i=0; i<p.length; i++)
		{
			if(p[i].getStock() < 10)
				count++;
		}
	
		System.out.print("Count many products have stock < 10: "+count);
	}
}

public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[5];
		ProductDisplay pd = new ProductDisplay();
		for(int i=0; i<p.length; i++)
		{
			System.out.print("enter the product name: ");
			String pn = sc.next();
			System.out.print("enter the product stock: ");
			int stock = sc.nextInt();
			System.out.print("\n");
			
			p[i] = new Product(pn,stock);
		}
		
		pd.display(p);
	}
}