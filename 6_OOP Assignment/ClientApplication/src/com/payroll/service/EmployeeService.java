package com.payroll.service;

import java.util.*;

import com.payroll.model.*;

public interface EmployeeService {

	public boolean isAddEmployee(Employee employee);
	public List getEmployeeList();
	public boolean deleteEmpById(int id);
}
