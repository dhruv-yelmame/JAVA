/*Q1. Employee Salary System
Concepts Used: Abstract class, method overriding, logic
 Operations to Perform:
1. Create an abstract class Employee
2. Fields: empId, name, basicSalary
3. Abstract method: calculateSalary()
4. Create two subclasses:
	PermanentEmployee (HRA 20%, DA 10%)
	ContractEmployee (HRA 10%, DA 5%)
5. Calculate total salary
6. Display employee details
*/

abstract class Employee
{
	protected int empId;
	protected String name;
	protected int basicSalary;
	void setEmp(int empId,String name,int basicSalary)
	{
		this.empId=empId;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	abstract double calculateSalary();
	
}

class PermanentEmployee extends Employee
{
	double calculateSalary()
	{
		double hra = basicSalary*0.2;
		double da = basicSalary*0.1;
		
		return basicSalary+hra+da;
	}
}

class ContractEmployee extends Employee
{
	double calculateSalary()
	{
		double hra = basicSalary*0.1;
		double da = basicSalary*0.05;
		
		return basicSalary+hra+da;
	}
}

public class EmployeeSalarySystem
{
	public static void main(String x[])
	{
		Employee e = null;
		e = new PermanentEmployee();
		e.setEmp(1,"Dhruv",1000);
		System.out.println("Emp 1: "+e.calculateSalary());
		
		e = new ContractEmployee();
		e.setEmp(2,"Ram",2000);
		System.out.println("Emp 2: "+e.calculateSalary());
	}
}