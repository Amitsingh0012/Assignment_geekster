package com.Employee_address.Employee.address.controller;

import com.Employee_address.Employee.address.model.Address;
import com.Employee_address.Employee.address.model.Employee;
import com.Employee_address.Employee.address.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("employees")
    public Employee getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("employees/{id}")
    public Employee getEmployeeById(@RequestParam Long id){
        return employeeService.getById(id);
    }
    @PostMapping("employees")
    public String addEmployee(@RequestBody Employee emp){
        return employeeService.addEmployee(emp);
    }
    @PutMapping("employees/{id}")
    public String addEmployeeById(@RequestParam Long id, @RequestParam String fname, @RequestParam String lname){
        return employeeService.updateEmployeeById(id,fname,lname);
    }


}
