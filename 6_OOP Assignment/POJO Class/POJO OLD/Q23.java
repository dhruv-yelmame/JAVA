/*Q23. WAP to create POJO class name as Student with field name, id and per and we have class
name as Dept with two methods
void setStudent(Student student): this method is used for accept student as parameter
void showStudent(): this method is used for show the student details.
*/

import java.util.*;
class Student
{
	private String name;
	private int id;
	private int percentage;
	
	public void setStudent(String name,int id,int percentage)
	{
		this.name=name;
		this.id=id;
		this.percentage=percentage;
	}	
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getPercentage()
	{
		return percentage;
	}
}

class Dept
{
	private Student student;
	public void setStudent(Student student)
	{
		this.student=student;
	}
	
	public void showStudent()
	{
		System.out.println("Name\tID\tPercentage");
		System.out.println(student.getName()+ "\t" + student.getId()  + "\t" + student.getPercentage()+"%");
	}
}

public class Q23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the name: ");
		String name = sc.next();
		System.out.print("enter the id: ");
		int id = sc.nextInt();
		System.out.print("enter the percentage: ");
		int percentage = sc.nextInt();
		
		Student s = new Student();
		s.setStudent(name,id,percentage);
		
		Dept d = new Dept();
		d.setStudent(s);
		d.showStudent();
	}
}