/*Q12. Create a class Employee with:
Fields: id, name, basicSalary, isPermanent

Parameterized constructor to initialize fields.
Write methods:
calculateNetSalary() →

if permanent → HRA = 20%, DA = 10%, PF = 12%
if temporary → HRA = 10%, DA = 5%, PF = 0
compareSalary(Employee e) → return higher salary employee name.

Task Logic:
 Create 3 Employee objects.
 Compare each pair using logic (nested comparison).
Expected Learning: Complex if-else + constructor initialization + inter-object comparison.
*/


class Employee
{
	private int id;
	private String name;
	private int basicSalary;
	private String isPermanent;
	
	Employee(int id,String name,int basicSalary,String isPermanent)
	{
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
		this.isPermanent=isPermanent;
	}
	
	String getName()
	{
		return name;
	}
	
	
	double calculateNetSalary()
	{
		double hra, da, pf;

		if(isPermanent.equals("permanent"))
		{
			hra = 0.20 * basicSalary;
            da  = 0.10 * basicSalary;
            pf  = 0.12 * basicSalary;
		}
		else
		{
			hra = 0.10 * basicSalary;
            da  = 0.05 * basicSalary;
            pf  = 0.0;
		}
		
	return basicSalary + hra + da - pf;
		
	}
	
	String compareSalary(Employee e)
	{
		if(this.calculateNetSalary() > e.calculateNetSalary())
			return this.name;
		else
			return e.name;
	}
}

public class Q12
{
	public static void main(String x[])
	{
		
		Employee e1 = new Employee(1,"dhruv",1000,"permanent");
		Employee e2 = new Employee(2,"shri",100,"temporary");
		Employee e3 = new Employee(3,"Ganesh",400,"permanent");
		
		
		double res1 = e1.calculateNetSalary();
		System.out.println("Employee 1: "+res1);
		double res2 = e2.calculateNetSalary();
		System.out.println("Employee 2: "+res2);
		double res3 = e3.calculateNetSalary();
		System.out.println("Employee 3: "+res3);
		
		System.out.print("\n");
		
		System.out.println("Between e1 & e2: " + e1.compareSalary(e2) + " has higher salary");
        System.out.println("Between e2 & e3: " + e2.compareSalary(e3) + " has higher salary");
        System.out.println("Between e1 & e3: " + e1.compareSalary(e3) + " has higher salary");
		
		//String msg = (e1.compareSalary(e2))? "EMP1":
	}
}