/*Q1. Create a Student class with fields: name, marks.
 Use a parameterized constructor to initialize both fields.
 Write a method checkResult() that prints "Pass" if marks ≥ 35, otherwise "Fail".
 Create 3 student objects and print their results.
Concepts Used:
 ✔ Parameterized constructor
 ✔ If–else logic
Explanation:
The constructor sets the student’s name and marks.
Then you apply simple logical condition (≥ 35).
*/


class Student 
{
	private String name;
	private int marks;
	
	//Parameterized constructor
	Student(String name, int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	//If–else logic
	void checkResult()
	{
		if(marks >= 35)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}

public class Q1
{
	public static void main(String x[])
	{
		Student s1 = new Student("Dhruv",25);
		Student s2 = new Student("Shri", 94);
		Student s3 = new Student("Mayur", 69);
		s1.checkResult();
		s2.checkResult();
		s3.checkResult();
	}
}
