package com.Employee_address.Employee.address.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String first_name;
    private String lstName;
    @ManyToOne()
    @JoinColumn(name = "address_Id")
    private Address address;
}
