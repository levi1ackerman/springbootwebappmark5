package com.levi.springbootwebappmark5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.levi.springbootwebappmark5.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> { //We'll be declaring the methods here, and we're mentioning the class we're working with i.e., Product and the primary key type i.e., Integer.
    
}
