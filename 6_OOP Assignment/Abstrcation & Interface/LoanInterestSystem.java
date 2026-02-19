/*Q9. Loan Interest System
Concept: Abstract class + financial logic
Conditions:
1. Abstract class Loan
2. Fields: amount, years
3. Abstract method calculateInterest()
4. Loan Types:
	HomeLoan → 7%
	CarLoan → 9%
	PersonalLoan → 12%
5. If years > 5 → reduce interest by 1%
*/

abstract class Loan
{	
	protected int amount;
	protected int years;
	void setDetails(int amount,int years)
	{
		this.amount=amount;
		this.years=years;
	}
	
	abstract double calculateInterest();
	
}

class HomeLoan extends Loan
{
	double calculateInterest()
	{
		double rate = 0.07;
		
		if(years > 5)
		{
			rate = rate - 0.01;
		}
		
		return amount*rate*years;
	}
}

class CarLoan extends Loan
{
	double calculateInterest()
	{
		double rate = 0.09;
		
		if(years > 5)
		{
			rate = rate - 0.01;
		}
		
		return amount*rate*years;
	}
}

class PersonalLoan extends Loan
{
	double calculateInterest()
	{
		double rate = 0.12;
		
		if(years > 5)
		{
			rate = rate - 0.01;
		}
		
		return amount*rate*years;
	}
}

public class LoanInterestSystem
{
	public static void main(String x[])
	{
		Loan l = null;
		
		l = new HomeLoan();
		l.setDetails(20000,5);
		System.out.println("HomeLoan Interest: "+l.calculateInterest());
		
		l = new CarLoan();
		l.setDetails(50000,7);
		System.out.println("CarLoan Interest: "+l.calculateInterest());
		
		l = new PersonalLoan();
		l.setDetails(25000,10);
		System.out.println("PersonalLoan Interest: "+l.calculateInterest());
	}
}