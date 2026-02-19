/*1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
The manager gets a 20% bonus on salary.

The developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.
*/


class Employee
{
	String name;
	int salary;
	void setEmp(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	int getSalary()
	{
		return 0;
	}
}
class Manager extends Employee
{
	int getSalary()
	{
		int	bonus=salary*20/100;
		return salary+bonus;
	}
}
class Developer extends Employee
{
	int getSalary()
	{
		int	bonus=salary*10/100;
		return salary+bonus;
	}
}
public class Q1
{
	public static void main(String x[])
	{
		Employee e = null;
		e = new Manager();
		e.setEmp("Shri",5000);
		int res = e.getSalary();
		System.out.println("Manager: "+res);
		e = new Developer();
		e.setEmp("Dhruv",3500);
		res = e.getSalary();
		System.out.println("Developer: "+res);
	}
}