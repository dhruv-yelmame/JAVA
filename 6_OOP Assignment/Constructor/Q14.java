/*Q14. Create a class LoanApplicant with:
Fields: name, age, annualIncome, creditScore, existingLoans
Constructor: Initialize all fields.
Logic Method: isEligible()
 Return true only if all the following conditions match:
age between 21 and 55
annualIncome ≥ 3,50,000
creditScore ≥ 700
existingLoans < 3
If creditScore is between 650–699 → income must be ≥ 5,00,000
If existingLoans = 2 → creditScore must be ≥ 750
Task:
 Create 3 applicants and check eligibility for each.
Focus: Compound conditions + nested logic + constructor handling.
*/

class LoanApplicant
{
	private String name;
	private int age;
	private int annualIncome;
	private int creditScore;
	private int existingLoans;
	
	LoanApplicant(String name,int age,int annualIncome,int creditScore,int existingLoans)
	{
		this.name=name;
		this.age=age;
		this.annualIncome=annualIncome;
		this.creditScore=creditScore;
		this.existingLoans=existingLoans;
	}
	
	boolean isEligible()
	{
		 // Basic conditions
        if(age < 21 || age > 55)
            return false;

        if(existingLoans >= 3)
            return false;
		
		// Special case loan rule
        if(existingLoans == 2 && creditScore < 750)
            return false;
		
		 // Credit score ruless
        if(creditScore >= 700)
        {
            if(annualIncome >= 350000)
                return true;
            else
                return false;
        }
        else if(creditScore >= 650 && creditScore <= 699)
        {
            if(annualIncome >= 500000)
                return true;
            else
                return false;
        }
        else
        {
            return false;
        }
    
	}
}

public class Q14
{
	public static void main(String x[])
	{
		LoanApplicant l1 = new LoanApplicant("Dhruv",22,450000,799,2);
		LoanApplicant l2 = new LoanApplicant("Shri",32,600000,749,3);
		LoanApplicant l3 = new LoanApplicant("Ganesh",20,450000,700,5);
		
		System.out.println("Applicant 1: "+l1.isEligible());
		System.out.println("Applicant 2: "+l2.isEligible());
		System.out.println("Applicant 3: "+l3.isEligible());
	}
}