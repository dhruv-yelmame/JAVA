package com.student;

import java.util.*;

public class StudentManagement {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> listStudent=new ArrayList<Student>();
		StudentUtility sUtility = new StudentUtility();
		while(true)
		{
			System.out.println("1.Add Student");
			System.out.println("2.Display Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Check Result");
			System.out.println("6.Exit");
			System.out.print("enter choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Student s = sUtility.addStudent();
				listStudent.add(s);
				break;
			case 2:
				sUtility.displayStudent(listStudent); 
				break;
			case 3:
				sUtility.updateStudent(listStudent);
				break;
			case 4:
				sUtility.deleteStudent(listStudent);
				break;
			case 5:
				sUtility.checkStudent(listStudent);
				System.out.println("Result Checking Successfull...");
				break;
			case 6:
				System.exit(0);
			default:
				System.out.print("Invalid choice");
			}
		}
	}

}

