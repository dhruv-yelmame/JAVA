package com.payroll.service;
import com.payroll.model.*;
import java.util.*;
public interface DeptService {
	
	public boolean isAddDept(Dept d);
	public List getAllDepts();
	public Dept deleteDept(int id);
	public Dept updateDept(int id);
	public Dept getDeptByName(String name);
	
}
