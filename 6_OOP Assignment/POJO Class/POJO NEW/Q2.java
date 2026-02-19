/*Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.
Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.
*/

import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int bs;
	private int hra;
	private int da;
	public void StoreData(int id,String name,int bs,int hra,int da)
	{
		this.id=id;
		this.name=name;
		this.bs=bs;
		this.hra=hra;
		this.da=da;
	}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	int getBs()
	{
		return bs;
	}
	int getHra()
	{
		return hra;
	}
	int getDa()
	{
		return da;
	}
}


class DisplayEmpData
{
	private Employee e[];
	
	public void setEmp(Employee e[])
	{
		this.e=e;
	}
	
	void show()
	{
		//1st operations
		int egs[] = new int[e.length];
		System.out.println("-----------------------------------");
		System.out.println("Gross salary for each employee");
		System.out.println("-----------------------------------");
		System.out.println("EmpID--EmpName--GrossSalary");
		for(int i=0; i<e.length; i++)
		{
			int gs = e[i].getBs() + e[i].getHra() + e[i].getDa();
			egs[i]=gs;
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+gs);
			gs = 0;
		}
		
		
		//2nd operations
		System.out.println("-----------------------------------");
		System.out.println("Employee with the maximum salary");
		System.out.println("-----------------------------------");
		int maxSalary=0, index=0;
		System.out.println("EmpID--EmpName--MaxSalary");
		for(int i=0; i<e.length; i++)
		{
			if(egs[i] > maxSalary)
			{
				maxSalary=egs[i];
				index=i;
			}
		}
		System.out.println(e[index].getId()+"\t"+e[index].getName()+"\t"+maxSalary);
		
		
		//3rd operations
		System.out.println("-------------------------------------------------------");
		System.out.println("Employees salary is greater than average salary of all");
		System.out.println("-------------------------------------------------------");
		System.out.println("EmpID--EmpName--MaxAvgSalary");
		int total=0;
		for(int i=0; i<e.length; i++)
		{
			total+=egs[i];
		}
		index=0;
		double avg = total / (double)e.length;
		double max = Double.MIN_VALUE;
		for(int i=0; i<e.length; i++)
		{
			if(egs[i] > avg)
			{
				System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+egs[i]);
			}
		}
		
	} 
}

public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayEmpData ded = new DisplayEmpData();
		Employee e[] = new Employee[5];
		for(int i=0; i<e.length; i++)
		{
			e[i] = new Employee();
			System.out.print("enter the id: ");
			int id = sc.nextInt();
			System.out.print("enter the name: ");
			String name = sc.next();
			System.out.print("enter the basic salary: ");
			int bs = sc.nextInt();
			System.out.print("enter the hra: ");
			int hra = sc.nextInt();
			System.out.print("enter the da: ");
			int da = sc.nextInt();
			System.out.print("\n");
			
			e[i].StoreData(id,name,bs,hra,da);
		}
		
		ded.setEmp(e);
		ded.show();
	}
}