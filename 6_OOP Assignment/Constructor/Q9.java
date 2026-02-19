/*Q9. Create an Employee class with:
empId, name, salary

Use constructor to initialize values.
Create an array of 10 employees.
Write a method filterHighSalary() that prints only those employees whose salary > 30000.
Concepts Used:
 ✔ Array of objects
 ✔ Constructor for object initialization
 ✔ Logical operator (salary > 30000)
Explanation:
 Constructor loads employee data.
 Using loops and logical conditions, filter and display selected employees.
*/

import java.util.*;
class Employee
{
	private int empId;
	private String name;
	private int salary;
	
	Employee(int empId,String name,int salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	int getId()
	{
		return empId;
	}
	String getName()
	{
		return name;
	}
	int getSalary()
	{
		return salary;
	}
	
}

class Display
{
	Employee e[];
	void filterHighSalary(Employee e[])
	{
		System.out.println();
		for(int i=0; i<e.length; i++)
		{
			if(e[i].getSalary() > 30000)
				System.out.println(e[i].getId()+"\t"+e[i].getName());
		}
			
	}
}


public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Display d = new Display();
		Employee e[] = new Employee[3];
		for(int i=0; i<e.length; i++)
		{
			System.out.print("enter the employee id: ");
			int empId =  sc.nextInt();
			System.out.print("enter the employee name: ");
			String name = sc.next();
			System.out.print("enter the employee salary: ");
			int salary = sc.nextInt();
			System.out.print("\n");
				
			e[i]=new Employee(empId,name,salary);
		}
		
		d.filterHighSalary(e);
	}
}