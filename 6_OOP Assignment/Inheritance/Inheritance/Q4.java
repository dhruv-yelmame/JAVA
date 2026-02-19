/*4. Question:
 Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.
Explanation:
 This tests inheritance for common fields and customized result display logic.
 */
 
class Student
{
	String name;
	int marks;
	void setStudent(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	String getResult()
	{	
		if(marks >= 50)
			return "pass";
		else
			return "fail";
	}
}

class EngineeringStudent extends Student
{
	String getResult()
	{	
		if(marks >= 50)
			return "pass";
		else
			return "fail";
	}
}

class MedicalStudent extends Student
{
	String getResult()
	{	
		if(marks >= 50)
			return "pass";
		else
			return "fail";
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Student s = null;
		s = new EngineeringStudent();
		s.setStudent("Dhruv",55);
		System.out.println("Engineering Student: "+s.getResult());
		
		s = new MedicalStudent();
		s.setStudent("Shri",15);
		System.out.println("Medical Student: "+s.getResult());
	}
}