/*Q6. Salary Deduction Logic System
Concept: Abstract class + logic
Problem Statement:
 Create an abstract class Employee.
Conditions & Operations:
1. Fields: empId, name, basicSalary, workingDays
2. Abstract method: calculateNetSalary()
3. Rules:
	If workingDays ≥ 26 → No deduction
	If workingDays between 20–25 → 10% deduction
	If workingDays < 20 → 20% deduction
4. Subclasses:
	Developer
	Tester
5. Each role has a different bonus:
	Developer → ₹5000
	Tester → ₹3000
6. Display final salary
*/

abstract class Employee
{
	protected int empId;
	protected double salary;
	protected int workingDays;
	void setEmp(int empId, double salary, int workingDays)
	{
		this.empId=empId;
		this.salary=salary;
		this.workingDays=workingDays;
	}
	
	abstract double calculateNetSalary();
}

class Developer extends Employee
{
	double calculateNetSalary()
	{
		int bonus = 5000;
		double finalSalary=0;
		if(workingDays >= 26)
			finalSalary = salary + bonus;
		else if(workingDays >=20 && workingDays<=25)
			finalSalary = salary - salary*0.1 + bonus;
		else if(workingDays < 20)
			finalSalary = salary - salary*0.2 + bonus;
	
		return finalSalary;
	}
}


class Tester extends Employee
{
	double calculateNetSalary()
	{
		int bonus = 3000;
		double finalSalary=0;
		if(workingDays >= 26)
			finalSalary = salary + bonus;
		else if(workingDays >=20 && workingDays<=25)
			finalSalary = salary - salary*0.1 + bonus;
		else if(workingDays < 20)
			finalSalary = salary - salary*0.2 + bonus;
	
		return finalSalary;
	}
}

public class SalaryDeductionSystem
{
	public static void main(String x[])
	{
		Employee e = null;
		e = new Developer();
		e.setEmp(12,1000,28);
		System.out.println("Developer Salary: "+e.calculateNetSalary());
		
		e = new Tester();
		e.setEmp(11,1000,20);
		System.out.println("Tester Salary: "+e.calculateNetSalary());
	}
}
