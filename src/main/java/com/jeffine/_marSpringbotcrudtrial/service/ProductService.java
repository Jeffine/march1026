package com.jeffine._marSpringbotcrudtrial.service;

import com.jeffine._marSpringbotcrudtrial.model.Product;
import com.jeffine._marSpringbotcrudtrial.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> displayAll(){
        return productRepository.findAll();

    }
}
