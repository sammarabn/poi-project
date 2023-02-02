package com.example.BestRead.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Getter
@Setter
public class Book {

    @Column(name = "name")
    private String name;
    @Column(name = "desc")
    private String desc;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
