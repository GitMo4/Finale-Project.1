package com.example.H2Example.Product;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Entity;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@ToString
public class Product {

    @Id

    @Column
    private int id;


    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double price;

}