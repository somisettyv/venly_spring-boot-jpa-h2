package com.mytech.employee.service;

import java.util.List;

public interface EmplomentService {
	public List<String> getAllEmployees(long departmentId);
	public void addEmployee(String name, String job, String manager, double salary);
}
