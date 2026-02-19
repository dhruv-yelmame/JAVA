package com.payroll.repository;

import java.util.List;

import com.payroll.model.*;

public interface EmployeeRepository {
	public boolean isAddEmployee(Employee employee);
	public List getEmployeeList();
	public boolean deleteEmpById(int id);
}
