package com.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping({"/api"})

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value ="/post")
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }

    @GetMapping(path = {"/{id}"})
    public Employee findOne(@PathVariable("id") int id){
        return employeeService.findById(id);
    }
    
    @PutMapping(path = {"/put/{id}"})
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
        Employee updatedEmployee = employeeService.update(id, employee);

        if (updatedEmployee != null) {
            return ResponseEntity.ok(updatedEmployee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(path ={"/{id}"})
    public Employee delete(@PathVariable("id") int id) {
        return employeeService.delete(id);
    } 

    @GetMapping(value="/all")
    public List findAll(){
        return employeeService.findAll();
    }
}