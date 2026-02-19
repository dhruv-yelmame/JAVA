package com.student;
import java.util.*;

public class StudentUtility implements StudentImpl {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public Student addStudent() {
		Student student=new Student();
		System.out.print("enter name: ");
		String name = sc.next();
		System.out.print("enter id: ");
		int id = sc.nextInt();
		System.out.print("enter percentage: ");
		int per = sc.nextInt();
		
		student.setId(id);
		student.setName(name);
		student.setPercentage(per);
		
		return student;
	}


	@Override
	public void displayStudent(List<Student> listStudent) {
		Iterator<Student> i = listStudent.iterator();
		
		while(i.hasNext())
		{
			Student obj = i.next();
				
			System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getPercentage());
		}
	}


	@Override
	public void updateStudent(List<Student> listStudent) {
		System.out.print("enter id to update: ");
		int id = sc.nextInt();
		boolean found = false;
		Iterator<Student> i = listStudent.iterator();
		System.out.print("\n");
		while(i.hasNext())
		{
			Student obj = i.next();
			if(id==obj.getId())
			{
				System.out.print("enter new name: ");
				String sname = sc.next();
				System.out.print("enter new id: ");
				int sid = sc.nextInt();
				System.out.print("enter new percentage: ");
				int per = sc.nextInt();
				
				obj.setName(sname);
				obj.setId(sid);
				obj.setPercentage(per);
				
				found=true;
				break;
			}
		}
		
		if(!found)
			System.out.println("id does not found");
	}


	@Override
	public void deleteStudent(List<Student> listStudent) {
		System.out.print("enter id to delete: ");
		int id = sc.nextInt();
		boolean found = false;
		Iterator<Student> i = listStudent.iterator();
		
		while(i.hasNext())
		{
			Student obj = i.next();
			if(id==obj.getId())
			{
				i.remove();
				found=true;
				break;
			}
		}
		
		if(!found)
			System.out.println("id does not found");
		else
			System.out.println("deleted successfully...");
		
	}


	@Override
	public void checkStudent(List<Student> listStudent) {
		Iterator<Student> i = listStudent.iterator();
		
		while(i.hasNext())
		{	
			Student obj = i.next();
			if(obj.getPercentage() > 35)
			{
				obj.setResult(true);
			}
			else
			{
				obj.setResult(false);
			}
			
			String result = obj.isResult()?"Pass": "Fail";
			
			System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getPercentage()+"\t"+result);
			
		}
		
		
		
	}

}

