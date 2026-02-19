/*7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.
BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.
Explanation:
 Tests method overriding with percentage-based calculations.
*/

class Ticket
{
	int price;
	void setTicket(int price)
	{
		this.price=price;
	}
	
	int calculatePrice()
	{
		return price;
	}
}

class MovieTicket extends Ticket
{
	int calculatePrice()
	{
		int tax = price*18/100;
		return price+tax;
	}
}

class BusTicket extends Ticket
{
	int calculatePrice()
	{
		int tax = price*5/100;
		return price+tax;
	}
}

public class Q7
{
	public static void main(String x[])
	{
		Ticket t = new MovieTicket();
		t.setTicket(100);
		System.out.println("Movie Ticket after Tax: "+t.calculatePrice());
		
		t = new BusTicket();
		t.setTicket(100);
		System.out.println("Bus Ticket after Tax: "+t.calculatePrice());
	}
}