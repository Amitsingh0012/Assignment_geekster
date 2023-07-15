package com.example.MappingPractice.Mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String laptopId;

    private String laptopName;
    private String laptopBrand;
    private Integer laptopPrice;
    @OneToOne
    private Student student;
}
