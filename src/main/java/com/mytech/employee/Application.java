package com.mytech.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mytech.employee.service.EmplomentService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	EmplomentService emplomentService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		
		emplomentService.addEmployee("Venky", "Architect", "TestManager", 100000.00);
		
		List<String> employees = emplomentService.getAllEmployees(1);
		for(String employee : employees)
		{
			System.out.println("New Employee  => " + employee);
		}
	}
}