package com.jeffine._marSpringbotcrudtrial.ProductController;

import com.jeffine._marSpringbotcrudtrial.model.Product;
import com.jeffine._marSpringbotcrudtrial.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService productService;

    public ResponseEntity<List<Product>> getall(){

        return ResponseEntity.status(HttpStatus.OK).body(productService.displayAll());
    }
}
