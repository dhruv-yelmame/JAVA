/*Q1. Scenario:
A shopping application has two discount types: Festival Discount and Regular Discount.
You have to design a system where the main class depends only on parent class reference and objects can be swapped easily → Loose Coupling.
Requirement:
Create a parent class Discount.
Create child classes FestivalDiscount and RegularDiscount.
Using parent reference, assign child objects and calculate discount.
Input : Original Price: 1000
Choose Discount Type: Festival
Output : Final Price after Festival Discount: 800

Explanation:
You should write code where the main method refers to Discount d = new FestivalDiscount();
Later you can switch to new RegularDiscount() without changing any other code.
This demonstrates loose coupling.*/


class Discount
{
	int price;
	void setDiscount(int price)
	{
		this.price=price;
	}
	
	int getResult()
	{
		return price;
	}
}

class FestivalDiscount extends Discount
{
	int getResult()
	{
		int discountPrice = price*20/100;
		return price - discountPrice;
	}
}

class RegularDiscount extends Discount
{
	int getResult()
	{
		int discountPrice = price*5/100;
		return price - discountPrice;
	}
}

public class Q16
{
	public static void main(String x[])
	{
		Discount d = new FestivalDiscount();
		d.setDiscount(1000);
		int res = d.getResult();
		System.out.println("Final Price after Festival Discount: "+res);
		
		d = new RegularDiscount();
		d.setDiscount(1000);
		res = d.getResult();
		System.out.println("Final Price after Regular Discount: "+res);
	}
}