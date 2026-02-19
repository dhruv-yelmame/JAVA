package com.payroll.service;

import java.util.List;

import com.payroll.model.Attendance;
import com.payroll.repository.AttendanceRepoImpl;
import com.payroll.repository.AttendanceRepository;

public class AttendanceServiceImpl implements AttendanceService{

	AttendanceRepository attendRepo = new AttendanceRepoImpl();
	
	@Override
	public boolean isMaintainAttendance(Attendance attend) {
		return attendRepo.isMaintainAttendance(attend);
	}
	
	@Override
	public List getAllAttendance() {
		return attendRepo.getAllAttendance();
	}

}
