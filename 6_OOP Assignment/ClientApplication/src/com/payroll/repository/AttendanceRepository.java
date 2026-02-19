package com.payroll.repository;

import java.util.*;

import com.payroll.model.Attendance;

public interface AttendanceRepository {
	public boolean isMaintainAttendance(Attendance attend);
	public List getAllAttendance();
}
