package com.example.Work.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Work.Repo.EmployeeRepo;
import com.example.Work.entity.Employee;
@Service
public class EmployeeServiceImplementation implements EmployeeService {
 
	private EmployeeRepo emprepo;
	
	@Autowired
	public EmployeeServiceImplementation(EmployeeRepo emp)
	{
		emprepo=emp;
	}
	
	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public Optional<Employee> getEmpById(int id) {
		// TODO Auto-generated method stub
		return emprepo.findById(id);
	}

	@Override
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		 emprepo.save(emp);

	}

	@Override
	public void delEmpById(int id) {
		// TODO Auto-generated method stub

		emprepo.deleteById(id);
		
	}
	
	

}
