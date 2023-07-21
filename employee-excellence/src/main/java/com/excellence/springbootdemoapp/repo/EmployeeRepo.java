package com.excellence.springbootdemoapp.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.excellence.springbootdemoapp.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

	public List<Employee> findByAddress(String city);

	public List<Employee> findByName(String name);
	
	public List<Employee> findByNameAndAddress(String name, String address);
}
