/*Q16. Create an Employee class with a constructor to initialize:
empId, empName, basicSalary, department

Menu options:
1. Add employee
2. Calculate Net Salary using formula:
HRA = 20%
DA = 15%
PF = 12% deduction
	Bonus (apply logic):
	IT dept → 10%
	HR dept → 7%
	Others → 5%
3. Display employees
4. Display highest net salary employee
*/
import java.util.*;

class Employee
{
    private int empId;
    private String empName;
    private double basicSalary;
    private String department;
    private double netSalary;

    Employee(int empId, String empName, double basicSalary, String department)
    {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.department = department;
    }

    void calculateSalary()
    {
        double hra = basicSalary * 0.20;
        double da  = basicSalary * 0.15;
        double pf  = basicSalary * 0.12;

        double salary = basicSalary + hra + da - pf;
        double bonus;

        if(department.equalsIgnoreCase("IT"))
            bonus = salary * 0.10;
        else if(department.equalsIgnoreCase("HR"))
            bonus = salary * 0.07;
        else
            bonus = salary * 0.05;

        netSalary = salary + bonus;
    }

    double getNetSalary()
    {
        return netSalary;
    }

    void display()
    {
        System.out.println(empId + "\t" + empName + "\t" + netSalary + "\t" + department);
    }
}

public class Q16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Employee emp[] = new Employee[5];
        int count = 0;
        char ch;

        do
        {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Calculate Net Salary");
            System.out.println("3. Display Employees");
            System.out.println("4. Display Highest Net Salary Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Basic Salary: ");
                    double sal = sc.nextDouble();
                    System.out.print("Enter Department: ");
                    String dept = sc.next();

                    emp[count++] = new Employee(id, name, sal, dept);
                    break;

                case 2:
                    for(int i=0; i<count; i++)
                        emp[i].calculateSalary();
                    System.out.println("Salary calculated for all employees");
                    break;

                case 3:
                    System.out.println("ID\tName\tNetSalary\tDept");
                    for(int i=0; i<count; i++)
                        emp[i].display();
                    break;

                case 4:
                    int maxIndex = 0;
                    for(int i=1; i<count; i++)
                    {
                        if(emp[i].getNetSalary() > emp[maxIndex].getNetSalary())
                            maxIndex = i;
                    }
                    System.out.println("Highest Salary Employee:");
                    emp[maxIndex].display();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.print("Do you want to continue (y/n): ");
            ch = sc.next().charAt(0);

        } while(ch=='y' || ch=='Y');
    }
}
