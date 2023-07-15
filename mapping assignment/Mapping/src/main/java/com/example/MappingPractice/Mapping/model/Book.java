package com.example.MappingPractice.Mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bookId;

    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String bookPrice;

    @ManyToOne
    private Student student;
}
