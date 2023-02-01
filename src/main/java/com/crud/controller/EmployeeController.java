package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Employee;
import com.crud.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {

		return employeeService.addEmployee(employee);
	}

	@GetMapping("/getEmployees")
	public List<Employee> findAllEmployees() {
		return employeeService.getEmployees();
	}

	@GetMapping("/employeeById/{id}")
	public Optional<Employee> findProductById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}

	@PutMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Integer id) {
		return employeeService.updateEmployee(employee,id);
	}

	
}
