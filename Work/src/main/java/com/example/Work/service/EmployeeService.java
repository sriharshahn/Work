package com.example.Work.service;

import java.util.List;
import java.util.Optional;

import com.example.Work.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAll();
	public Optional<Employee>  getEmpById(int id);
	public void saveEmployee(Employee emp);
	public void delEmpById(int id);
	
}
