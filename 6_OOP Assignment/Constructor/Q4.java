/*Q4. Create an Employee class with fields name and salary, initialized with constructor.
 Write a method validateSalary() that checks:
Salary must be between 10,000 and 1,00,000 (inclusive).
 If valid → Print “Valid salary”
 Else → Print “Invalid salary”
Concepts Used:
 ✔ Constructor
 ✔ Logical AND operator (&&)
*/

class Employee
{
	private String name;
	private int salary;
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	String validateSalary()
	{
		if(salary >=10000 && salary <=100000)
			return name +": Valid salary";
		else
			return name +": Invalid salary";
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Employee e1 = new Employee("Virat",9000);
		Employee e2 = new Employee("Dhoni",49999);
		
		System.out.println(e1.validateSalary());
		System.out.println(e2.validateSalary());
	}
}