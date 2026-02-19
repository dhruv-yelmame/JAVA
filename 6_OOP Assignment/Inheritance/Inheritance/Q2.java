/*2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.
*/

class BankAccount
{
	int p;
	void setBank(int p)
	{
		this.p=p;
	}
	
	int calculateInterest()
	{
		return 0;
	}
}
class SavingsAccount extends BankAccount
{
	int calculateInterest()
	{
		
		return p*5/100;
	}
}
class CurrentAccount extends BankAccount
{
	int calculateInterest()
	{
		return p*3/100;
	}
}
public class Q2
{
	public static void main(String x[])
	{
		BankAccount ba = null;
		ba = new SavingsAccount();
		ba.setBank(4000);
		int res = ba.calculateInterest();
		System.out.println("Savings Account: "+res);
		ba = new CurrentAccount();
		ba.setBank(6000);
		res = ba.calculateInterest();
		System.out.println("Current Account: "+res);
	}
}
