package com.payroll.repository;

import java.util.List;

import com.payroll.model.Dept;
import com.payroll.model.Employee;

public interface DeptRepository {
	public boolean isAddDept(Dept d);
	public List<Dept> getAllDepts();
	public Dept deleteDept(int id);
	public Dept updateDept(int id);
	public Dept getDeptByName(String name);
}
