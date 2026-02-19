package com.payroll.service;

import java.util.*;

import com.payroll.model.Dept;
import com.payroll.model.Employee;
import com.payroll.repository.DeptRepoImpl;
import com.payroll.repository.DeptRepository;

public class DeptServiceImpl implements DeptService {
	
	DeptRepository deptRepo = new DeptRepoImpl();
	@Override
	public boolean isAddDept(Dept d) {
		return deptRepo.isAddDept(d);
	}

	@Override
	public List<Dept> getAllDepts() {
		return deptRepo.getAllDepts();
	}
	
	@Override
	public Dept deleteDept(int id) {
		return deptRepo.deleteDept(id);
	}
	
	@Override
	public Dept updateDept(int id) {
		return deptRepo.updateDept(id);
	}

	
	@Override
	public Dept getDeptByName(String name) {
		return deptRepo.getDeptByName(name);
	}
	
}
