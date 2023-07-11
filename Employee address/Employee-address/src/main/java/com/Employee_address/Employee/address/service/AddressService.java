package com.Employee_address.Employee.address.service;

import com.Employee_address.Employee.address.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;
}
