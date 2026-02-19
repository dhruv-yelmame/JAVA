package com.payroll.repository;

import java.util.*;

import com.payroll.model.Attendance;
public class AttendanceRepoImpl implements AttendanceRepository{
	List attendList = new ArrayList();
	
	@Override
	public boolean isMaintainAttendance(Attendance attend) {
		return attendList.add(attend);
	}

	@Override
	public List getAllAttendance() {
		return attendList;
	}
	
	
}
