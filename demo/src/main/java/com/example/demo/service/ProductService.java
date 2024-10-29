package com.example.demo.service;

import com.example.demo.service.ProductNotFoundException;
import com.example.demo.entity.Product;
import com.example.demo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

//Create a product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

//get a product by ID
    public Product getProduct(Long id) {
        return productRepository.findById(id)
        .orElseThrow(() -> new ProductNotFoundException("product not found with id: " + id));
    }

    //update a product
    public Product updateProduct(Long id, Product productDetails) {
        Product product = getProduct(id);

        // update fields
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());

        //save the updated product
        return productRepository.save(product);
    }


//delete a product
    public void deleteProduct (Long id) {
        Product product = getProduct(id);
        productRepository.delete(product);
    }


    //get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}