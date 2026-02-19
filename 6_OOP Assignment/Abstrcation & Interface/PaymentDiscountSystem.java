/*Q10. Payment Discount Logic
Concept: Interface + conditions
Rules:
1. Interface Payment
2. Method: payAmount(double amount)
3. Implementing classes:
	CashPayment
	CardPayment
4. Logic:
	Cash → 5% discount if amount > 5000
	Card → 2% discount if amount > 10000
*/


interface Payment
{
	 public double payAmount(double amount);
}

class CashPayment implements Payment
{
	public double payAmount(double amount)
	{
		if(amount > 5000)
			return amount-amount*0.05;
		else 
			return amount;
	}
}

class CardPayment implements Payment
{
	public double payAmount(double amount)
	{
		if(amount > 10000)
			return amount-amount*0.02;
		else 
			return amount;
	}
}

public class PaymentDiscountSystem
{
	public static void main(String x[])
	{
		Payment p = null;
		
		p = new CashPayment();
		System.out.println("Total Cash: "+p.payAmount(12000));
		
		p = new CardPayment();
		System.out.println("Total Card: "+p.payAmount(12000));

	}
}