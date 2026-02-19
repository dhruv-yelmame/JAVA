package com.payroll.client;

import java.util.*;

import com.payroll.model.Attendance;
import com.payroll.model.Dept;
import com.payroll.model.Employee;
import com.payroll.service.AttendanceService;
import com.payroll.service.AttendanceServiceImpl;
import com.payroll.service.DeptService;
import com.payroll.service.DeptServiceImpl;
import com.payroll.service.EmployeeService;
import com.payroll.service.EmployeeServiceImpl;

public class ClientApplication {
	static DeptService deptService = new DeptServiceImpl();
	static EmployeeService empService = new EmployeeServiceImpl();
	static AttendanceService attendService = new AttendanceServiceImpl();
	static Dept d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("1.add department");
			System.out.println("2.view all department");
			System.out.println("3.delete dept by id");
			System.out.println("4.update dept by id");
			System.out.println("5.view dept by name");
			System.out.println("6.add employee to dept");
			System.out.println("7.view all employee details");
			System.out.println("8.view deptwise employee details");
			System.out.println("9.delete employee details by id");
			System.out.println("10.Maintain Attendance");
			System.out.println("11.Show All Attendance Records");
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("enter dept name: ");
				String deptName = sc.next();
				System.out.print("enter dept id: ");
				int deptId = sc.nextInt();
			
				d = new Dept();
				d.setName(deptName);
				d.setId(deptId);
				boolean b = deptService.isAddDept(d);
				if (b) {
					System.out.println("dept added...");
				} else {
					System.out.println("dept is already exit");
				}
				break;
				
			case 2:
				List list = deptService.getAllDepts();
				System.out.println("All Department Details");
				System.out.println("--------------------------------------");
				if (list.size() > 0) {
					for (Object obj : list) {
						d = (Dept) obj;
						System.out.println(d.getId() + "\t" + d.getName());
					}
				} else {
					System.out.println("dept is not added !");
				}
				System.out.println("--------------------------------------");
				break;
				
			case 3:
				list = deptService.getAllDepts();
				System.out.print("enter dep id to delete: ");
				int id = sc.nextInt();
				boolean found = false;
				for (Object dept : list) {
					Dept obj = (Dept) dept;
					if (obj.getId() == id) {
						found = true;
						break;
					}
				}

				if (found) {
					deptService.deleteDept(id);
					System.out.println("dept deleted successfully...");
				} else
					System.out.println("dept does not found !");
				break;
				
			case 4:
				list = deptService.getAllDepts();
				System.out.print("enter dep id to update: ");
				id = sc.nextInt();
				found = false;
				for (Object dept : list) {
					Dept obj = (Dept) dept;
					if (obj.getId() == id) {
						found = true;
						break;
					}
				}

				if (found) {
					deptService.updateDept(id);
					System.out.println("dept updated successfully...");
				} else
					System.out.println("dept does not found !");
				break;
				
			case 5:
				list = deptService.getAllDepts();
				System.out.print("enter dept name: ");
				String name = sc.next();
				boolean flag = false;
				for (Object obj : list) {
					d = (Dept) obj;
					if (d.getName().equals(name)) {
						flag = true;
						break;
					}
				}

				if (flag) {
					deptService.getDeptByName(name);
				} else {
					System.out.println("dept name does not match !");
				}
				break;
				
			case 6:
				list = deptService.getAllDepts();
				if (list.size() > 0) {
					for (Object obj : list) {
						d = (Dept) obj;
						System.out.println(d.getId() + "\t" + d.getName());
					}
				}
				System.out.println("---------------------------------");
				System.out.print("enter employee id: ");
				int empId = sc.nextInt();
				System.out.print("enter employee name: ");
				String empName = sc.next();
				System.out.print("enter employee salary: ");
				int empSalary = sc.nextInt();
				Employee emp = new Employee(empId, empName, empSalary);
				System.out.print("enter dept id to add emp: ");
				id = sc.nextInt();
				flag = false;
				for (Object obj : list) {
					d = (Dept) obj;
					if (d.getId() == id) {
						emp.setDept(d);
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("emp added to dept");
					b = empService.isAddEmployee(emp);
					if (b) {
						System.out.println("employee save successfully...");
					} else {
						System.out.println("employee not save !");
					}
				} else {
					System.out.println("dept does not found !");
				}
				break;
				
			case 7:
				List empList = empService.getEmployeeList();
				System.out.println("All Employee Details");
				System.out.println("--------------------------------------");
				for (Object obj : empList) {
					Employee e = (Employee) obj;
					d = e.getDept();
					System.out.println(
							e.getEmpId() + "\t" + e.getEmpName() + "\t" + e.getEmpSalary() + "\t" + d.getName());
				}
				System.out.println("--------------------------------------");
				break;
				
			case 8:
				list = deptService.getAllDepts();
				empList = empService.getEmployeeList();
				System.out.print("enter dept name to get emp ");
				name = sc.next();
				found = false;
				for (Object obj2 : empList) {
					Employee e = (Employee) obj2;
					Dept d1 = e.getDept();
					if (d1.getName().equals(name)) {
						System.out.println(e.getEmpId() + "\t" + e.getEmpName() + "\t" + e.getEmpSalary());
						found = true;
					}
				}
				if (!found) {
					System.out.println("dept does not found !");
				}
				break;
			case 9:
				empList = empService.getEmployeeList();
				System.out.print("enter employee id: ");
				int empid = sc.nextInt();
				flag = false;
				for(Object obj : empList)
				{
					Employee e = (Employee)obj;
					if(e.getEmpId()==empid)
					{
						flag=true;
						break;
					}
				}
				if(flag)
				{
					empService.deleteEmpById(empid);
					System.out.println("employee deleted successfully");
				}
				else
				{
					System.out.println("id does not match !");
				}
				break;
			
			case 10:
				System.out.println("Show All Employee");
				empList = empService.getEmployeeList();
				for(Object obj : empList) {
					Employee e = (Employee)obj;
					System.out.println(e.getEmpId()+"\t"+e.getEmpName());
				}
				System.out.print("enter emp id to attendace: ");
				empid = sc.nextInt();
				System.out.println("enter inTime");
				Date d1 = new Date();
				System.out.println("enter outTime");
				Date d2 = new Date();
				Attendance attend = new Attendance(); 
				for(Object obj : empList) {
					Employee e = (Employee)obj;
					if(e.getEmpId()==empid)
					{
						attend.setEmployee(e);
						break;
					}
				}
				if(d1 != null || d2 != null)
				{
					attend.setStatus(true);
				}	
				attend.setInTime(d1);
				attend.setOutTime(d2);
				
				b = attendService.isMaintainAttendance(attend);
				if(b)
				{
					System.out.println("Attendace marked completed");
				}
				else
				{
					System.out.println("Attendace not marked completed");
				}
				break;
			case 11:
				List attendList = attendService.getAllAttendance();
				System.out.println("--------------------------------------");
				for(Object obj : attendList)
				{
					Attendance aobj = (Attendance)obj;
					Date inTime = aobj.getInTime();
					Date outTime = aobj.getOutTime();
					boolean status = aobj.isStatus();
					Employee e = aobj.getEmployee();
					Dept d = e.getDept();
					System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+d.getName()+"\t"+inTime+"\t"+outTime+"\t"+status);
				}
				System.out.println("--------------------------------------");
				break;
			default: 
				System.out.println("Invalid Choice..");
			}

		} while (true);
	}
}
