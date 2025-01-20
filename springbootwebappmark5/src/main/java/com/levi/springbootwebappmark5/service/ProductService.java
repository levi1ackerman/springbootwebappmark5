package com.levi.springbootwebappmark5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.levi.springbootwebappmark5.model.Product;
import com.levi.springbootwebappmark5.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // List<Product> products = new ArrayList<>(Arrays.asList(
    //     new Product(101, "iPhone", 500000), 
    //     new Product(102, "Canon Camera", 70000), 
    //     new Product(103, "Mental Peace", 0)));

    public List<Product> getProducts(){
        //return products;
        return repo.findAll();
    }

    public Product getProductbyId(int prodId){
    //     return products.stream() //We're using the Java Stream API
    //             .filter(p -> p.getProdId() == prodId) //'p' here I think is an alias for each product in the product list. I think it loops through each product.
    //             //.findFirst().get(); //Returns only the first instance of such an object.
    //             .findFirst().orElse(new Product(100, "No Item", -1)); //Returns this object if an invalid prodId is sent.
            return repo.findById(prodId).orElse(new Product()); //Using the repository layer functions. These methods are in the JPA class which is extended by our repository interface.
    }

    public void addProduct(Product prod){ //To add a product given by the client.
        //products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        
        // int index = 0;
        // for(int i = 0; i < products.size(); ++i){ //We have to do this manual shit because we are using an ArrayList to store our data and not an actual database.

        //     if (products.get(i).getProdId() == prod.getProdId())
        //         index = i;
        // }
        // products.set(index, prod);
        repo.save(prod); //Originally updates the product, but creates one if not present.
    }

    public void deleteProduct(int prodId) {
       
    //     int index = 0; //We have to do this again because we don't have a fucking database. Also if it's an invalid ID it'll delete the first product lol.
    //     for(int i = 0; i < products.size(); ++i){ //We have to do this manual shit because we are using an ArrayList to store our data and not an actual database.

    //         if (products.get(i).getProdId() == prodId)
    //             index = i;
    //     }

    //     //We can't delete a product with just prodId we need its index.
    //     products.remove(index);
    
    repo.deleteById(prodId);
    }
}
