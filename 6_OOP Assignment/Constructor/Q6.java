/*Q6. Create a BankAccount class with:
accountNumber , name , balance
Initialize these using a parameterized constructor.
Create a method withdraw(int amount) that checks:
Amount must be greater than 0
Amount must be <= balance
After withdrawal, update balance
If invalid → print message accordingly

Explanation:
You must apply multiple logical checks together:
*/


class BankAccount
{
	private int accountNumber;
	private String name;
	private int balance;
	BankAccount(int accountNumber,String name,int balance)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}
	
	void withdraw(int amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Balance: "+balance);
		}
		else 
		{
			System.out.println("Invalid amount");
		}
	}
}

public class Q6
{
	public static void main(String x[])
	{
		BankAccount b1 = new BankAccount(1,"Dhurv",500);
		BankAccount b2 = new BankAccount(2,"Gj",400);
		b1.withdraw(45);
		b2.withdraw(-0);
	}
}