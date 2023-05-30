package com.example.demojava5d9.service.Impl;

import com.example.demojava5d9.entity.Product;
import com.example.demojava5d9.repository.ProductRepository1111;
import com.example.demojava5d9.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRepositoryImpl implements ProductService {
    @Autowired
    private ProductRepository1111 repository;

    @Override
    public List<Product> getAllPro() {
        return repository.findAll();
    }
}
