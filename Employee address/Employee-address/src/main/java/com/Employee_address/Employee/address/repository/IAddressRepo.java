package com.Employee_address.Employee.address.repository;

import com.Employee_address.Employee.address.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {

}
