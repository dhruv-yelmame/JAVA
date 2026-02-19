/*Q2. Bank Account System
Concepts Used: Abstract class, runtime polymorphism
 Operations:
1. Abstract class BankAccount
2. Fields: accountNo, balance
3. Abstract methods: calculateInterest()
4. Child classes:
	SavingsAccount → 4% interest
	CurrentAccount → 2% interest
5. Add interest to balance
6. Display updated balance
*/

abstract class BankAccount
{
	protected int accountNo;
	protected double balance;
	void setBank(int accountNo, double balance)
	{
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	abstract double calculateInterest();
}

class SavingsAccount extends BankAccount
{
	double calculateInterest()
	{
		double interest = balance*0.04;
		return balance+interest;
	}
}

class CurrentAccount extends BankAccount
{
	double calculateInterest()
	{
		double interest = balance*0.02;
		return balance+interest;
	}
}

public class BankAccountSystem
{
	public static void main(String x[])
	{
		BankAccount ba = null;
		ba = new SavingsAccount();
		ba.setBank(121,1000);
		System.out.println("Saving Account: "+ba.calculateInterest());
		
		ba = new CurrentAccount();
		ba.setBank(55,2000);
		System.out.println("Current Account: "+ba.calculateInterest());
	}
}