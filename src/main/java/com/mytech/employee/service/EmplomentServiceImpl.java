package com.mytech.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytech.employee.model.Department;
import com.mytech.employee.model.Employee;
import com.mytech.employee.repository.DepartmentRepository;
import com.mytech.employee.repository.EmployeeRepository;

@Service
public class EmplomentServiceImpl implements EmplomentService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<String> getAllEmployees(long teamId) {
		List<String> result = new ArrayList<String>();
		List<Employee> players = employeeRepository.findByDepartmentNumber(teamId);
		for (Employee player : players) {
			result.add(player.getName());
		}

		return result;
	}

	public void addEmployee(String name, String job, String manager, double salary) {
		
		Department department = departmentRepository.findById(1l).orElse(new Department());
		
		Employee newPlayer = new Employee();
		newPlayer.setName(name);
		newPlayer.setDepartment(department);
		newPlayer.setJobName(job);
		newPlayer.setManagerName(manager);
		newPlayer.setSalary(salary);
		employeeRepository.save(newPlayer);
	}
}
