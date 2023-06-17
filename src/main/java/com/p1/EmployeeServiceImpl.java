package com.p1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

	
    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee delete(int id) {
    	Employee employee = findById(id);
        if(employee != null){
            repository.delete(employee);
        }
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return repository.findById(id);
    }

    
    @Override
    public Employee update(int id, Employee updatedEmployee) {
        Optional<Employee> optionalEmployee = Optional.ofNullable(repository.findById(id));

        if (optionalEmployee.isPresent()) {
            Employee existingEmployee = optionalEmployee.get();
            existingEmployee.setEname(updatedEmployee.getEname());
            existingEmployee.setEmailid(updatedEmployee.getEmailid());
            existingEmployee.setPhn(updatedEmployee.getPhn());

            return repository.save(existingEmployee);
        } else {
            return null;
        }
    }
    


    
}