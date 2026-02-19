package com.payroll.repository;

import java.util.*;

import com.payroll.model.Dept;
import com.payroll.model.Employee;

public class DeptRepoImpl implements DeptRepository {
	private List deptList = new ArrayList();
	private List empList = new ArrayList();
	
	Scanner sc = new Scanner(System.in);
	@Override
	public boolean isAddDept(Dept d) {
		boolean result = this.isDeptExit(d);
		if(result)
		return false;
		else
			return deptList.add(d);
	}

	//check the department is exit or not
	private boolean isDeptExit(Dept d)
	{
		boolean flag = false;
		for(Object obj: deptList)
		{
			Dept d1 = (Dept)obj;
			if(d.getName().equals(d1.getName()) || d.getId()==d1.getId())
			{
				flag = true;
				break;
			}			
		}
		return flag;
	}
	@Override
	public List getAllDepts() {
		return deptList;
	}

	@Override
	public Dept deleteDept(int id) {
		Iterator i = deptList.iterator();
		while (i.hasNext()) {
			Dept d = (Dept) i.next();
			if (d.getId() == id) {
				i.remove();
				return d;
			}
		}
		return null;
	}

	@Override
	public Dept updateDept(int id) {
		Iterator i = deptList.iterator();
		while(i.hasNext())
		{
			Dept d = (Dept) i.next();
			if(d.getId()==id)
			{
				System.out.println("enter new dep name");
				String deptname = sc.next();
				System.out.println("enter new dep id");
				int depid = sc.nextInt();
				
				d.setName(deptname);
				d.setId(depid);
				
				return d;
			}
		}
		return null;
	}

	@Override
	public Dept getDeptByName(String name) {
		Iterator i = deptList.iterator();
		while(i.hasNext())
		{
			Dept d = (Dept)i.next();
			if(d.getName().equals(name))
			{
				System.out.println(d.getId()+"\t"+d.getName());
			}
		}
		return null;
	}
}
