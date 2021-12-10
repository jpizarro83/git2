package com.cjava.apirest.controller;
/*
 * Aplicativo desarrollado para la clase de Java Expert
 * Autor: CJavaPeru/Edwin Maravi (emaravi@gmail.com)
 * Version 0.001
 * www.cjavaperu.com
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.*;

import com.cjava.apirest.model.Employee;

@RestController
public class EmployeeController
{
	@GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck()	{
		return "{ \"todoOk\" : true }";
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees()	{
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee("1","edwin","maravi","emaravi@cjavaperu.com"));
		employeesList.add(new Employee("2","Katherine","sulbaran","info@cjavaperu.com"));
		return employeesList;
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id)	{
		Employee emp = new Employee(id, "edwin","maravi","emaravi@cjavaperu.com");
		return emp;
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable String id)	{
		Employee emp = newEmployee;
		return emp;
	}
	
	@DeleteMapping(value = "/employee/{id}", produces = "application/json; charset=utf-8")
	public String deleteEmployee(@PathVariable String id) {
		return "{ \"operacionExitosa\" : true }";
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee newEmployee){
		String id = String.valueOf(new Random().nextInt());
		Employee emp = new Employee(id, newEmployee.getFirstName(), newEmployee.getLastName(), newEmployee.getEmail());
		return emp;
	}

	@PostMapping("/employee2")
	public Employee addEmployee2(@RequestBody Employee newEmployee){
		String id = String.valueOf(new Random().nextInt());
		Employee emp = new Employee(id, newEmployee.getFirstName(), newEmployee.getLastName(), newEmployee.getEmail());
		return emp;
	}

	@PostMapping("/employee3")
	public Employee addEmployee3(@RequestBody Employee newEmployee){
		String id = String.valueOf(new Random().nextInt());
		Employee emp = new Employee(id, newEmployee.getFirstName(), newEmployee.getLastName(), newEmployee.getEmail());
		return emp;
	}
}
