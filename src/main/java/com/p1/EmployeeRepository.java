package com.p1;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Long> 
{

    void delete(Employee employee);

    List findAll();

    Employee findById(int id);

    Employee save(Employee employee);

	
}