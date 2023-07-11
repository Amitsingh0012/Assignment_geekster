package com.Employee_address.Employee.address.repository;

import com.Employee_address.Employee.address.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
    Employee getAllEmployee();
}
