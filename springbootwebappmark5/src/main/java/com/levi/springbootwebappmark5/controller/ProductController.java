package com.levi.springbootwebappmark5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.levi.springbootwebappmark5.model.Product;
import com.levi.springbootwebappmark5.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;







@RestController
public class ProductController {

    @Autowired //Injects the object of the ProductService class which is annotated with @Service
    ProductService service;

    //@RequestMapping("/products")  
    @GetMapping("/products")
    public List<Product> getProducts(){

        return service.getProducts();
    }

    //@RequestMapping("/products/{prodId}")
    @GetMapping("/products/{prodId}")
    public Product getProductbyId(@PathVariable int prodId){ //We are returning a singular object of type Product based on its ID number. @PathVariable is to match the variable from the function definition to the inner lines.

        return service.getProductbyId(prodId);
    }

    //@RequestMapping("/products")    //This causes a conflict because we already have a request mapped to /products.
    @PostMapping("/products") //That's why we use @GetMapping and @PostMapping so that we can reuse the request mapping names. By default all @RequestMappings are GET.    
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){

        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){

        service.deleteProduct(prodId);
    }

}
