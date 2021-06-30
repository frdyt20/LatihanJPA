package com.example.latihanjpa2.service;

import com.example.latihanjpa2.entity.Product;
import com.example.latihanjpa2.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    
    public List<Product> getProducts() {
    	return productRepository.findAll();
    }
}
