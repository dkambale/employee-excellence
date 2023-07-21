package com.excellence.springbootdemoapp.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excellence.springbootdemoapp.Employee;
import com.excellence.springbootdemoapp.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	public Employee saveEmployee(Employee e) {

		// save employee

		employeeRepo.save(e);

		return e;
	}

	public List<Employee> getListOfEmployee() {

		Iterable<Employee> iterator = employeeRepo.findAll();
		List<Employee> emps = new LinkedList();
		iterator.forEach(emp -> {

			emps.add(emp);
		});
		return emps;
	}

	public Employee updateEmployee(Employee employee) {
		employee = employeeRepo.save(employee);
		return employee;
	}

	public boolean updateEmployee(Integer id) {
		employeeRepo.deleteById(id);
		return true;
	}

	public List<Employee> getEmployeeByCity(String cityName) {

		List<Employee> list = employeeRepo.findByAddress(cityName);
		return list;
	}

	public List<Employee> getEmployeeByCityAndName(String cityName, String name) {
		List<Employee> list = employeeRepo.findByNameAndAddress(name, cityName);
		return list;
	}

}
