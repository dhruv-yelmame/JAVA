/*10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.
ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.
Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/

class Employee
{
	int salary;
	void setEmployee(int salary)
	{
		this.salary=salary;
	}
	
	int calculateBonus()
	{
		return salary;
	}
}

class PermanentEmployee extends Employee
{
	int calculateBonus()
	{
		int bonus = salary*25/100;
		return salary+bonus;
	}
}

class ContractEmployee extends Employee
{
	int calculateBonus()
	{
		int bonus = salary*10/100;
		return salary+bonus;
	}
}

public class Q10
{
	public static void main(String x[])
	{
		Employee e = new PermanentEmployee();
		e.setEmployee(6000);
		System.out.println("Permanent Employee: "+e.calculateBonus());
		
		e = new ContractEmployee();
		e.setEmployee(3000);
		System.out.println("Contract Employee: "+e.calculateBonus());
	}
}