/*Q4. Scenario:
Company has Full-Time and Part-Time employees.
 Salary calculation differs for each type.
Requirement:
Create parent class Employee.
 Create child classes FullTimeEmployee and PartTimeEmployee.
 Using parent reference, compute salary.
Input:
Employee Type: Part-Time
Hours Worked: 5
Rate Per Hour: 100
Output:Salary for Part-Time Employee: 500
Explanation:
Main code must work using:
Employee emp = new PartTimeEmployee();
This reduces dependency on specific class → Loose coupling.
*/

class Employee
{
	int hoursWork, rate;
	void setEmp(int hoursWork, int rate)
	{
		this.hoursWork=hoursWork;
		this.rate=rate;
	}
	
	int getResult()
	{
		return 0;
	}
}

class FullTimeEmployee extends Employee
{
	int getResult()
	{
		return hoursWork*rate;
	}
}

class PartTimeEmployee extends Employee
{
	int getResult()
	{
		return hoursWork*rate;
	}
}

public class Q19
{
	public static void main(String x[])
	{
		
		Employee e = new FullTimeEmployee();
		e.setEmp(10,150);
		int res = e.getResult();
		System.out.println("Salary for Full-Time Employee: "+res);
		
		e = new PartTimeEmployee();
		e.setEmp(5,100);
		res = e.getResult();
		System.out.println("Salary for Part-Time Employee: "+res);
	}
}