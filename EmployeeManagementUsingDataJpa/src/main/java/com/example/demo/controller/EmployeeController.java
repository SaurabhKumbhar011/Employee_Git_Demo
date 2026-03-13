package com.example.demo.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.EmployeeNotFound;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/employees")  //class level url
@AllArgsConstructor
public class EmployeeController { // http://localhost:1234/employees

	EmployeeService service;

	// @RequestMapping(method = RequestMethod.GET, )
	@GetMapping("/message")   //method level url
	// @ResponseBody
	public String getmessage() {
		return "Leave us we are getting sleep!!!!";
	}

	@PostMapping("/save") // http://localhost:3124/employees/save
	public String createEmployee(@RequestBody @Validated Employee employee) {
		return service.saveEmployee(employee);

	}

	@PutMapping("/update") // http://localhost:3124/employees/update
	public String updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);

	}

	@DeleteMapping("/delete/{id}") // http://localhost:3124/employees/delete/123
	public String deleteEmployee(@PathVariable("id") int empId) {
		return service.deleteEmployee(empId);

	}

	@GetMapping("/fetch/{id}") // http://localhost:3124/employees/fetch/123
	public Employee getEmployee(@PathVariable("id") int empId) throws EmployeeNotFound {
		return service.getEmployee(empId);

	}

	@GetMapping("/fetchAll") // http://localhost:3124/employees/fetchAll
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();

	}
	
	@GetMapping("/fetchAllByDesg/{empDesg}") // http://localhost:3124/employees/delete/123
	public List<Employee> getAllEmployee(@PathVariable("empDesg") String empDesg) {
		return service.getEmployeeByDesg(empDesg);

	}
	
	@GetMapping("/fetchAllBetween") // http://localhost:3124/employees/delete/123
	public List<Employee> getAllEmployeeSal(@RequestParam("sal1") int initialSal, @RequestParam("sal2") int finalSal) {
		return service.getEmployeeByBetweenSal(initialSal, finalSal);

	}
	
	

}
