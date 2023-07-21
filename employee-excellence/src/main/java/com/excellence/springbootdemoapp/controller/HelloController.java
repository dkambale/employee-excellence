package com.excellence.springbootdemoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excellence.springbootdemoapp.Employee;
import com.excellence.springbootdemoapp.service.EmployeeService;

@RestController
public class HelloController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(name = "/sayhello", value = "/sayhello")
	public String sayHello() {

		return "Hello Ninja";
	}

	@GetMapping(name = "/sayhello/from", value = "/sayhello/from")
	public String returnHelloWithName(@RequestParam("firstname") String firstName,
			@RequestParam("lastname") String lastName) {

		return "hello" + firstName + lastName;
	}
	// 400 --> bad request

	@GetMapping(name = "/sayhello/from", value = "/sayhello/from/{firstname}/{lastname}")
	public String returnHelloWithNameUsingPathVariable(@PathVariable("firstname") String firstName,
			@PathVariable("lastname") String lastName) {

		return "hello" + firstName + lastName;
	}

	@PostMapping(name = "saveemployee", value = "saveemployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee savedEmployee = employeeService.saveEmployee(employee);
		return savedEmployee;
	}

	@GetMapping("employee/getlist")
	public List<Employee> getListOfEmployee() {

		List<Employee> list = employeeService.getListOfEmployee();
		return list;

	}

	@PutMapping(name = "updateemployee", value = "updateemployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee savedEmployee = employeeService.updateEmployee(employee);
		return savedEmployee;
	}

	@DeleteMapping(name = "deleteemployee", value = "deleteemployee")
	public boolean deleteEmployee(@RequestParam("id") Integer id) {
		boolean isDeleted = employeeService.updateEmployee(id);
		return isDeleted;
	}

	@GetMapping("/getEmployeeByCity")
	public List<Employee> getEMployeeForAddress(@RequestParam("city") String cityName) {

		return employeeService.getEmployeeByCity(cityName);
	}

	@GetMapping("/getEmployeeByCityAndName")
	public List<Employee> getEMployeeForAddress(@RequestParam("city") String cityName,
			@RequestParam("name") String name) {

		return employeeService.getEmployeeByCityAndName(cityName,name);
	}

}
