/*Q3. Scenario:
A telecom company has plans for Prepaid and Postpaid users.
 Bill calculation changes based on type.
Requirement:
Create parent class UserPlan.
 Create child classes Prepaid and Postpaid.
 Use parent reference to calculate total bill.
Input: User Type: Prepaid
Calls Used: 120
Rate Per Call: 1
Output: Total Bill for Prepaid User: 120
Explanation:
Main class should depend on the parent reference:
 UserPlan plan = new Prepaid();
 Switching to Postpaid must be possible easily → Loose Coupling.
*/

class UserPlan
{
	int callused, rate;
	void setPlan(int callused, int rate)
	{
		this.callused=callused;
		this.rate=rate;
	}
	
	int getResult()
	{
		return 0;
	}
}

class Prepaid extends UserPlan
{
	int getResult()
	{
		int planCharge = callused*rate;
		return planCharge;
	}
}

class Postpaid extends UserPlan
{
	int getResult()
	{
		int planCharge = callused*rate;
		return planCharge;
	}
}

public class Q18
{
	public static void main(String x[])
	{
		UserPlan u = new Prepaid();
		u.setPlan(120,1);
		int res = u.getResult();
		System.out.println("Total Bill for Prepaid User: "+res);
		
		u = new Postpaid();
		u.setPlan(140,2);
		res = u.getResult();
		System.out.println("Total Bill for Postpaid User: "+res);
	}
}