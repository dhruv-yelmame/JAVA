package com.payroll.repository;

import com.payroll.model.*;
import java.util.*;

public class EmployeeRepoImpl implements EmployeeRepository{
	List empList = new ArrayList();
	
	@Override
	public boolean isAddEmployee(Employee employee) {
		return empList.add(employee);
	}
	
	@Override
	public List getEmployeeList() {
		return empList;
	}
	
	@Override
	public boolean deleteEmpById(int id) {
	Iterator i = empList.iterator();
	while(i.hasNext())
	{
		Employee e = (Employee)i.next();
		if(e.getEmpId()==id)
		{
			i.remove();
			return true;
		}
	}
		return false;
	}

}
