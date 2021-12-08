package com.example.Work.Controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Work.Repo.EmployeeRepo;
import com.example.Work.entity.Employee;
import com.example.Work.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class RController {
	private EmployeeRepo empser ;
	
@Autowired	
public RController(EmployeeRepo emp)
{
	empser=emp;
}
@GetMapping("/employees")
public List<Employee> getAll()
{
	//return empser.getAll();
	return empser.findAll();
}
@GetMapping("/employees/{id}")
public Optional<Employee> getEmpById(@PathVariable("id")int id)
{
	//return empser.getEmpById(id);
	return empser.findById(id);
	
}
@PostMapping("/save")
public void save(@RequestBody Employee employee)
{
	empser.save(employee);
	//empser.saveEmployee(employee);
}
@DeleteMapping("/delete/{id}")
public void deleById(@PathVariable("id")int id)
{
	empser.deleteById(id);
	//empser.delEmpById(id);
}




}
