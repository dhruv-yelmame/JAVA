/*6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.
Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.
Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.
*/

class Order
{
	int orderId;
	int amount;
	void setOrder(int orderId,int amount)
	{
		this.orderId=orderId;
		this.amount=amount;
	}
	
	int getFinalBill()
	{
		return 0;
	}
}

class CODOrder extends Order
{
	int getFinalBill()
	{
		return amount+50;
	}
}

class OnlinePaymentOrder extends Order
{
	int getFinalBill()
	{
		int cb = amount*5/100;
		return amount-cb;
	}
}

public class Q6
{
	public static void main(String x[])
	{
		Order o = new CODOrder();
		o.setOrder(1,400);
		System.out.println("CODOrder final bill: "+o.getFinalBill());
		
		o = new OnlinePaymentOrder();
		o.setOrder(2,400);
		System.out.println("OnlinePaymentOrder final bill: "+o.getFinalBill());
	}
}