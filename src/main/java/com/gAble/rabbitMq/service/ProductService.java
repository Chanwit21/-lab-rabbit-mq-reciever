package com.gAble.rabbitMq.service;

import com.gAble.rabbitMq.entity.Products;
import com.gAble.rabbitMq.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public void createProduct(Products product){
        repo.save(product);
    }
}
