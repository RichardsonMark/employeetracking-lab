package com.example.codeclan.employeetracking;

import com.example.codeclan.employeetracking.models.Employee;
import com.example.codeclan.employeetracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveEmployee() {
		Employee employee = new Employee("Mark", 41, 1111, "test@test.com");
		employeeRepository.save(employee);
	}
}
