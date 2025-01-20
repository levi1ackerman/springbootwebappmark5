package com.levi.springbootwebappmark5.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity //If we want a class whose table we want to create, we need to specify this annotation.
public class Product {

    public Product() {
        //TODO Auto-generated constructor stub
    }

    @Id
    private int prodId;
    private String prodName;
    private int price;

}
