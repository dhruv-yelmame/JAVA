/*9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.
EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.
Explanation:
 Tests inheritance where logic changes depending on product type.
 */
 
class Product
{
	int id;
	String name;
	int basePrice;
	void setProduct(int id,String name,int basePrice)
	{
		this.id=id;
		this.name=name;
		this.basePrice=basePrice;
	}
	
	int getFinalPrice()
	{
		return 0;
	}
}

class LuxuryProduct extends Product
{
	int getFinalPrice()
	{
		int fp = basePrice*20/100;
		return fp+basePrice;
	}
}

class EssentialProduct extends Product
{
	int getFinalPrice()
	{
		int fp = basePrice*5/100;
		return fp+basePrice;
	}
}

public class Q9
{
	public static void main(String x[])
	{
		Product p = new LuxuryProduct();
		p.setProduct(1,"BMW",50000);
		System.out.println("Luxury Product after tax: "+p.getFinalPrice());
		
		p = new EssentialProduct();
		p.setProduct(2,"TATA",25000);
		System.out.println("Essential Product after tax: "+p.getFinalPrice());
	}
}