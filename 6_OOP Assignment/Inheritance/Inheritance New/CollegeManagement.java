/*Q1. Problem Statement :
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.

Class Structure:
Parent Class – Person
Data Members:
int id, String name, String address, String contactNo
Member Methods:
addDetails() – Accept and store basic person details.
displayDetails() – Display details of a person.
updateAddress() – Update the address of a person.
deleteContact() – Delete contact number.
showBasicInfo() – Display ID, name, and contact number.

Child Class 1 – Student extends Person
Additional Data Members:
String courseName, int marks[3], double percentage
Additional Methods:
    6. enterMarks() – Accept marks of three subjects.
    7. calculatePercentage() – Calculate and store percentage based on marks.

Child Class 2 – Faculty extends Person
Additional Data Members:
String subject, double salary, int experience
Additional Methods:
   8. assignSubject() – Assign subject to faculty.
   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.

*Operations to Perform (Sequentially):

Add student details using addDetails() method.
Enter marks for three subjects using enterMarks().
Calculate and store the student’s percentage using calculatePercentage().
Update the student’s contact number using updateContact().
Display all details of the student using displayDetails().
Add faculty details using the addDetails() method.
Assign subject to faculty using assignSubject().
Calculate salary increment for the faculty using calculateIncrement().
Delete the faculty’s address using deleteAddress().
Display complete faculty information using displayFacultyInfo().

Instructions:
Use constructors in all classes for initialization.
Use the super keyword to call parent constructors in child classes.
Apply method overriding for displayDetails() to show specific outputs for each child class.
Perform all 10 operations sequentially in the main() method.
Do not use collections; use arrays or primitive variables only.
*/


import java.util.*;
class Person
{
	Scanner sc = new Scanner(System.in);
	
	int id;
	String name, address, contactNo;
	Person(int id, String name, String address, String contactNo)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.contactNo=contactNo;
	}
	
	
	void addDetails()
	{
		System.out.print("enter the id: ");
		id = sc.nextInt();
		System.out.print("enter the name: ");
		name = sc.next();
		System.out.print("enter the address: ");
		address = sc.next();
		System.out.print("enter the contact: ");
		contactNo = sc.next();
	}
	
	void displayDetails()
	{
		System.out.println("--Display Person Detail--");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Contact: "+contactNo);
		System.out.println("---------------------------");
	}
	
	void updateAddress()
	{
		System.out.print("enter the new address: ");
		address = sc.next();
		System.out.println("Updated Address...");
	}
	
	void updateContact()
    {
        System.out.print("Enter new contact number: ");
        contactNo = sc.next();
        System.out.println("Contact updated...");
    }
	
	void deleteContact() 
	{
		contactNo = null;
		System.out.println("Contact is deleted successfully...");
	}
	
	void deleteAddress()
    {
        address = null;
        System.out.println("Address deleted...");
    }
	
	void showBasicInfo() 
	{
		System.out.println("---Display Basic info---");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Contact: "+contactNo);
		System.out.println("---------------------------");
	}
	
}

class Student extends Person
{
	String courseName;
	int marks[] = new int[3];
	double percentage;
	
	Student(int id, String name, String address, String contactNo)
	{
		super(id,name,address,contactNo);
	}
	
	
	void enterMarks()
	{
		System.out.print("enter the course name: ");
		courseName = sc.next();
		
		System.out.print("enter the marks of 3 subject: ");
		for(int i=0; i<marks.length; i++)
		{
			marks[i]=sc.nextInt();
		}
	}
	
	void calculatePercentage()
	{
		int total=0;
		for(int i=0; i<marks.length; i++)
		{
			total+=marks[i];
		}
		
		percentage = total / 3.0;
		//System.out.printf("Percentage: %.2f\n", percentage);
		
	}
	
	void displayDetails()
    {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Course: " + courseName);
		System.out.println("Percentage: "+percentage);
		System.out.println("---------------------------");
    }
}

class Faculty extends Person
{
	String subject;
	double salary;
	int experience;
	Faculty(int id, String name, String address, String contactNo)
	{
		super(id,name,address,contactNo);
	}
	
	void assignSubject()
	{
		System.out.print("enter the subjuct name for faculty: ");
		subject = sc.next();
	}
	
	void calculateIncrement() 
	{
		System.out.print("enter the salary: ");
		salary = sc.nextDouble();
		
		System.out.print("enter the experience in years: ");
		experience = sc.nextInt();
		
		if(experience > 5)
		{
			salary +=salary*10/100;
			System.out.println("10% Increment Applied!");
		}
	}
	
	void displayFacultyInfo()
	{
		System.out.println("--Display Faculty Detail--");
		System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact No: " + contactNo);
		System.out.println("Subject: "+subject);
		System.out.println("Salary: "+salary);
		System.out.println("Experience: "+experience);
		System.out.println("---------------------------");
	}

}

public class CollegeManagement
{
	public static void main(String x[])
	{
		//student object
		Student s = new Student(1,"","","");
		
		s.addDetails();
		
		s.enterMarks();
		
		s.calculatePercentage();
		
		s.updateContact();
		
		s.displayDetails();
		
		
		//faculty object
		Faculty f = new Faculty(1,"","","");
			
		f.addDetails();
		
		f.assignSubject();
		
		f.calculateIncrement() ;
		
		f.deleteAddress();
		
		f.displayFacultyInfo();
		
	}
}
