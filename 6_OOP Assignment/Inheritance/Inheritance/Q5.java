/*5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.
For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.
Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
 */
 
class Staff
{
	int salary;
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	int incrementSalary()
	{
		return 0;
	}
}

class TeachingStaff extends Staff
{
	int incrementSalary()
	{
		int inc = salary*15/100;
		return salary+inc;
	}
}

class NonTeachingStaff extends Staff
{
	int incrementSalary()
	{
		int inc = salary*10/100;
		return salary+inc;
	}
}

public class Q5
{
	public static void main(String x[])
	{
		Staff s = new TeachingStaff();
		s.setSalary(4000);
		System.out.println("Teaching Staff: "+s.incrementSalary());
		
		s = new NonTeachingStaff();
		s.setSalary(10000);
		System.out.println("NonTeaching Staff: "+s.incrementSalary());
	}
}