package com.kikecorp.productmicroservice.controller;

import com.kikecorp.productmicroservice.entity.ProductEntity;
import com.kikecorp.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping("/createProduct")
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity){
        productRepository.save(productEntity);
    }

}
