/*Q2. Write a menu driven program in java to Create a class name as Employee to hold empid, empname , empemail , empcontact and empsalry.
The menu options should be: 		
	1. Add Employee Details.
	2. Display All Employee Details.
	3. Search Employee By Id then employee is found or not.
	4. Update Employee Details By Name.
	5. Delete Employee Details By Email.
	6. Display list count of the Employee in Company.
	7. Display list the employee in the ascending order of employee salary.
	8. Display the employee details in highest salary.
	9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.
	10. Exit.
*/


import java.util.*;
class Employee
{
	private int empid;
	private String empname;
	private String empemail;
	private String empcontact;
	private int empsalry;
	
	public void setEmpId(int empid)
	{
		this.empid=empid;
	}
	public void setEmpName(String empname)
	{
		this.empname=empname;
	}
	public void setEmpEmail(String empemail)
	{
		this.empemail=empemail;
	}
	public void setEmpContact(String empcontact)
	{
		this.empcontact=empcontact;
	}
	public void setEmpSalary(int empsalry)
	{
		this.empsalry=empsalry;
	}
	
	int getId()
	{
		return empid;
	}
	String getName()
	{
		return empname;
	}
	String getEmail()
	{
		return empemail;
	}
	String getContact()
	{
		return empcontact;
	}
	int getSalary()
	{
		return empsalry;
	}
}


class DisplayEmployee
{
	private Employee e[];
	public void setEmp(Employee e[])
	{
		this.e=e;
	}
	
	
	//1. Add Employee Details.
	Scanner sc = new Scanner(System.in);
	void addEmpDetail(Employee e[])
	{
		for(int i=0; i<e.length; i++)
		{
			e[i] = new Employee();
			System.out.print("enter the employee id: ");
			int empid = sc.nextInt();
			System.out.print("enter the employee name: ");
			String empname = sc.next();
			System.out.print("enter the employee email: ");
			String empemail = sc.next();
			System.out.print("enter the employee contact: ");
			String empcontact = sc.next();
			System.out.print("enter the employee salary: ");
			int empsalry = sc.nextInt();
			System.out.print("\n");
			
			e[i].setEmpId(empid);
			e[i].setEmpName(empname);
			e[i].setEmpEmail(empemail);
			e[i].setEmpContact(empcontact);
			e[i].setEmpSalary(empsalry);
		}
	}
	
	
	//2. Display All Employee Details.
	void disEmpDetail(Employee e[])
	{
		for(int i=0; i<e.length; i++)
		{
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getEmail()+"\t"+e[i].getContact()+"\t"+e[i].getSalary());
		}
	}
	
	
	//3. Search Employee By Id then employee is found or not.
	void searchEmpById(Employee e[])
	{
		System.out.print("enter the employee id: ");
		int id = sc.nextInt();
		boolean found = false;
		int index=0;
		for(int i=0; i<e.length; i++)
		{
			if(id==e[i].getId())
			{
				found=true;
				index=i;
				break;
			}
			else
			{
				found=false;
			}
		}

			if(found)
				System.out.println(e[index].getId()+"\t"+e[index].getName()+"\t"+e[index].getEmail()+"\t"+e[index].getContact()+"\t"+e[index].getSalary());
			else
				System.out.println("Not Found");
	}
	
	
	//4. Update Employee Details By Name.
	void updateEmpByName(Employee e[])
	{
		System.out.print("enter the employee name to update: ");
		String name = sc.next();
		
		for(int i=0; i<e.length; i++)
		{
			if(name.equals(e[i].getName()))
			{
				System.out.print("enter the id: ");
				int id = sc.nextInt();
				System.out.print("enter the name: ");
				name = sc.next();
				System.out.print("enter the email: ");
				String email = sc.next();
				System.out.print("enter the contact: ");
				String contact = sc.next();
				System.out.print("enter the salary: ");
				int salary = sc.nextInt();
				
				e[i].setEmpId(id);
				e[i].setEmpName(name);
				e[i].setEmpEmail(email);
				e[i].setEmpContact(contact);
				e[i].setEmpSalary(salary);
			}
		}
	}
	
	//5. Delete Employee Details By Email.
	
	
	//6. Display list count of the Employee in Company.
	void countEmp(Employee e[])
	{
		int count=e.length;
		System.out.println("Count: "+count);
	}
	
	
	//7. Display list the employee in the ascending order of employee salary.
	void disEmpAscBySalary(Employee e[])
	{
		for(int i=0; i<e.length; i++)
		{
			for(int j=i+1; j<e.length; j++)
			{
				if(e[i].getSalary() > e[j].getSalary())
				{
					Employee temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}
			}
		}
	
		for(int i=0; i<e.length; i++)
		{
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getEmail()+"\t"+e[i].getContact()+"\t"+e[i].getSalary());			
		}
	}
	
	
	//8. Display the employee details in highest salary.
	void disEmpHighBySalary(Employee e[])
	{
		int max=0;
		int index=0;
		for(int i=0; i<e.length; i++)
		{
			if(e[i].getSalary() > max)
			{
				max = e[i].getSalary();
				index=i;
			}
		}
		
		System.out.println(e[index].getId()+"\t"+e[index].getName()+"\t"+e[index].getEmail()+"\t"+e[index].getContact()+"\t"+e[index].getSalary());			
	}
	
	//9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.
	void disEmpMinMaxSalary(Employee e[])
	{
		for(int i=0; i<e.length; i++)
		{
			if((e[i].getSalary() >= 10000) && (e[i].getSalary() <= 60000))
			{
				System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getEmail()+"\t"+e[i].getContact()+"\t"+e[i].getSalary());		
			}
		}
	}
	
	//exit
}

public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Employee e[] = new Employee[3];
		DisplayEmployee de = new DisplayEmployee();
		int choice;
		char ch;
		
		do
		{
			System.out.println("1. Add Employee Details.");
			System.out.println("2. Display All Employee Details.");
			System.out.println("3. Search Employee By Id then employee is found or not.");
			System.out.println("4. Update Employee Details By Name.");
			System.out.println("5. Delete Employee Details By Email.");
			System.out.println("6. Display list count of the Employee in Company.");
			System.out.println("7. Display list the employee in the ascending order of employee salary.");
			System.out.println("8. Display the employee details in highest salary.");
			System.out.println("9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.");
			System.out.println("10. Exit.");
			
			System.out.print("enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					de.addEmpDetail(e);
					break;
					
				case 2:
					de.disEmpDetail(e);
					break;
				
				case 3:
					de.searchEmpById(e);
					break;
				
				case 4:
					de.updateEmpByName(e);
					break;
					
				case 6:
					de.countEmp(e);
					break;
				
				case 7:
					de.disEmpAscBySalary(e);
					break;
				
				case 8:
					de.disEmpHighBySalary(e);
					break;
				
				case 9:
					de.disEmpMinMaxSalary(e);
					break;
				
				case 10:
					System.out.print("Exiting System...");
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice !");
			}
		
				System.out.print("Do you want to continue(y/n): ");
				ch = sc.next().charAt(0);
		
		}while(ch=='y' || ch=='Y');		
	}
}