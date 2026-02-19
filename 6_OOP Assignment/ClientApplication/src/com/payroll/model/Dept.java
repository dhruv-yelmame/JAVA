package com.payroll.model;

import java.util.List;

public class Dept {
	private int id;
	private String name;
	private List empList;
	
	
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
	
	public List getEmpList() {
		return empList;
	}
	
	public void setEmpList(List empList) {
		this.empList = empList;
	}
		
}
