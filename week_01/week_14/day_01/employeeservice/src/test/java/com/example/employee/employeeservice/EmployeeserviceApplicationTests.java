package com.example.employee.employeeservice;

import com.example.employee.employeeservice.models.Employee;
import com.example.employee.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee colette = new Employee("Colette", "dufficy", 100);
		Employee jonny = new Employee("Jonny", "Walker", 10);
		employeeRepository.save(colette);
		employeeRepository.save(jonny);
	}



}
