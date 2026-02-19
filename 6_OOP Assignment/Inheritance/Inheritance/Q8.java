/*8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.
CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
Explanation:
 Tests inheritance with customized formula calculations.
*/

class Loan
{
	double amount;
	int years;
	void setLoan(double amount,int years)
	{
		this.amount=amount;
		this.years=years;
	}
	
	double getEMI()
	{
		return 0;
	}
}

class HomeLoan extends Loan
{
	double getEMI()
	{
	
		return ;
	}
}

class CarLoan extends Loan
{
	double getEMI()
	{
		
		return ;
	}
}

public class Q8
{
	public static void main(String x[])
	{
		Loan l = new HomeLoan();
		l.setLoan(75000,8);
		System.out.println("EMI for Home Loan: "+l.getEMI());
		
		l = new CarLoan();
		l.setLoan(45000,4);
		System.out.println("EMI for Car Loan: "+l.getEMI());
	}
}