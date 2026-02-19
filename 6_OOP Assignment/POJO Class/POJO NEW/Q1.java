/*Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations
*/

import java.util.*;
class Student
{
	private int rn;
	private String name;
	private int[] marks;
	
	public void setArr(int rn, String name, int marks[])
	{
		this.rn=rn;
		this.name=name;
		this.marks=marks;
	}
	
	int getRn()
	{
		return rn;
	}
	String getName()
	{
		return name;
	}
	int[] getMarks()
	{
		return marks;
	}
	
}
class DisplayStudent
{	
	Student s[];
	public void totalMarks(Student s[])
	{
		this.s=s;
	}
	
	void show()
	{	
		//1st operations
		System.out.println("RollNo--Name--TotalMarks");
		for(int i=0; i<s.length; i++)
		{
			int[] marks = s[i].getMarks();
			int total=0;
			for(int j=0; j<marks.length; j++)
			{
				total=total+marks[j];
			}
			System.out.println(s[i].getRn()+"\t"+s[i].getName()+"\t"+total);
		}
		
		
		//2nd operations
		System.out.println("Highest Average of marks: ");
		double max=-1;
		int index=0;
		for(int i=0; i<s.length; i++)
		{
			int[] marks = s[i].getMarks();
			int total=0;
			for(int j=0; j<marks.length; j++)
			{
				total=total+marks[j];
			}
			double avg = total/(double)marks.length;
			if(avg>max)
			{
				max=avg;
				index=i;
			}
		}
		
		System.out.println("RollNo--Name--Average");
		System.out.println(s[index].getRn()+"\t"+s[index].getName()+"\t"+max);
		
		
		//3rd operations
		System.out.println("Display the list of students who have failed in any subject:");
		System.out.println("RollNo--Name");
		for(int i=0; i<s.length; i++)
		{
			int[] marks = s[i].getMarks();
			for(int j=0; j<marks.length; j++)
			{
				if((marks[j]) < 35)
				{
					System.out.println(s[i].getRn()+"\t"+s[i].getName());
					break;
				}
			}
			
		}
	}
}

public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayStudent d = new DisplayStudent();
		Student s[] = new Student[5];
		for(int i=0; i<s.length; i++)
		{
			s[i] = new Student();
			System.out.print("enter the rollNo: ");
			int rn = sc.nextInt();
			System.out.print("enter the name: ");
			String name = sc.next();
			int marks[] = new int[3];
			System.out.print("enter the marks of 3 subject:");
			for(int j=0; j<marks.length; j++)
			{
				marks[j]=sc.nextInt();
			}
			
			s[i].setArr(rn,name,marks);
		}
		
		d.totalMarks(s);
		d.show();
		
	}
}