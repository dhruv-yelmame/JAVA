package com.vectorPojo;
import java.util.*;
class Student
{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	private String name;
	private int marks;
	public Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public char getGrade()
	{
		 if (marks >= 90)
	        return 'A';
	     else if (marks >= 75)
	        return 'B';
	     else if (marks >= 60)
	        return 'C';
	     else
	        return 'D';
	}
}
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector(); 
		
		v.add(new Student(1,"Dhruv",65));
		v.add(new Student(2,"Ram",95));
		v.add(new Student(3,"Dhiraj",41));
		v.add(new Student(4,"Venki",34));
		
		double average=0;
		
		do
		{
			System.out.println("1.Display all students");
			System.out.println("2.Calculate average marks");
			System.out.println("3.Display students scoring above average");
			System.out.println("4.Assign grade based on marks");
			
			System.out.println("enter your choice: ");
			int choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				for(Object obj : v)
				{
					Student s = (Student)obj;
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
				}
				break;
			case 2:
				int sum =0;
				for(Object obj : v)
				{
					Student s = (Student)obj;
					sum = sum + s.getMarks();
				}
				average = (double)sum / v.size();
				System.out.println("Average Marks: "+average);
				break;
			case 3:
				for(Object obj : v)
				{
					Student s = (Student)obj;
					if(s.getMarks() > average)
					{
						System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
					}
				}
				break;
			case 4:
				for(Object obj : v)
				{
					Student s = (Student)obj;
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks()+"\t"+s.getGrade());
				}
				break;
			default:
				System.out.println("Invalid Case");
			}
		}while(true);

	}

}
