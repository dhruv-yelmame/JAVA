/*Q5. Online Payment System
Concepts: Interface, multiple implementations
 Operations:
1. Interface Payment
2. Method: makePayment(double amount)
3. Implementing classes:
	CreditCardPayment
	UPIPayment
4. Apply transaction charges:
	Credit Card → 2%
	UPI → 1%
5. Show final amount paid
*/


interface Payment
{	
	
	public double makePayment(double amount);
}

class CreditCardPayment implements Payment
{
	public double makePayment(double amount)
	{
		double charge = (double)amount*0.02;
		return amount+charge;
	}
}

class UPIPayment implements Payment
{
	public double makePayment(double amount)
	{
		double charge = (double)amount*0.01;
		return amount+charge;
	}
}

public class OnlinePaymentSystem
{
	public static void main(String x[])
	{
		Payment p = null;
		p = new CreditCardPayment();
		System.out.println("Final Amount: "+p.makePayment(1000));
		
		p = new UPIPayment();
		System.out.println("Final Amount: "+p.makePayment(1000));
	}
}
