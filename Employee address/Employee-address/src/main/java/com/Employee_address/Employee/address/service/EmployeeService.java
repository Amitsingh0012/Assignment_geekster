package com.Employee_address.Employee.address.service;

import com.Employee_address.Employee.address.model.Employee;
import com.Employee_address.Employee.address.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public Employee getAllEmployee() {
        return iEmployeeRepo.getAllEmployee();
    }

    public String addEmployee(Employee emp) {
        iEmployeeRepo.save(emp);
        return "Added";
    }

    public Employee getById(Long id) {
        return iEmployeeRepo.getReferenceById(id);
    }

    public String updateEmployeeById(Long id, String fname, String lname) {
        Optional<Employee> emps=iEmployeeRepo.findById(id);
        return "Updated";
    }
}
