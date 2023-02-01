package com.crud.service;

import java.util.List;
import java.util.Optional;

import com.crud.model.Employee;


public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);

	public List<Employee> getEmployees();

	public Optional<Employee> getEmployeeById(int id);

	public void deleteEmployee(int id);

	public Employee updateEmployee(Employee employee, Integer id);
	
}
