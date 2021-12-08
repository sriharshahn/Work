package com.example.Work.Repo;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Work.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

	Employee getById(int id);

	void deleteById(int id);

}
