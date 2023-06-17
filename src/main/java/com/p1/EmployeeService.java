package com.p1;

import java.util.List;


public interface EmployeeService 
{
	public Employee create(Employee employee);
	public Employee delete(int id);
	public List findAll();
	public Employee findById(int id);
//	public Employee update(Employee employee);
	public Employee update(int id, Employee employee);
	
	
	
//	Employee update(Long id, Employee updatedEmployee);
	
}
