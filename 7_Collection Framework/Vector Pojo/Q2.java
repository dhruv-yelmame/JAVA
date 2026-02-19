package com.vectorPojo;
import java.util.*;
class Employee{
	private int empId;
	private String name;
	private int salary;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		v.add(new Employee(1,"Dhruv",10000));
		v.add(new Employee(2,"Ram",40000));
		v.add(new Employee(3,"Dhiraj",80000));
		v.add(new Employee(4,"Venki",120000));
		
		int newSalary=0;
		
		do 
		{
			System.out.println("1. Increase salary by 10% if salary < 50,000");
			System.out.println("2.Search employee by Id");
			System.out.println("3.Display employees earning more than 60,000");
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				for(Object obj : v)
				{
					Employee e = (Employee)obj;
					if(e.getSalary() < 50000)
					{
						newSalary = (int) (e.getSalary() + e.getSalary() * 0.1);
						e.setSalary(newSalary);
						 System.out.println("Updated Salary for "+e.getName() + ": "+newSalary);
					}
				}
				break;
			case 2:
				System.out.print("enter id to search: ");
				int id = sc.nextInt();
				boolean found = false;
				for(Object obj : v)
				{
					Employee e = (Employee)obj;
					if(id==e.getEmpId())
					{
						System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getSalary());
						found = true;
						break;
					}
				}
				
				if(!found)
					System.out.println("Emp Does not found");
				
				break;
			case 3:
				for(Object obj : v)
				{
					Employee e = (Employee)obj;
					if(e.getSalary() > 60000)
					{
						System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getSalary());
					}
				}
				break;
			default:
					System.out.println("Invalid Choice");
			}
		}while(true);
	}

}
