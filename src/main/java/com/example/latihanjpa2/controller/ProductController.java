package com.example.latihanjpa2.controller;

import com.example.latihanjpa2.entity.Product;
import com.example.latihanjpa2.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    
    @GetMapping("/getProducts")
    public List<Product> findAllProduct(){
    	return productService.getProducts();
    }
}
