package com.example.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Product
 */
@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;

    private String name;
    private String description;

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
}