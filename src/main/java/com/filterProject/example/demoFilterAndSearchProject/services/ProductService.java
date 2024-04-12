package com.filterProject.example.demoFilterAndSearchProject.services;

import com.filterProject.example.demoFilterAndSearchProject.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> searchProducts(String query);
    Product createProduct(Product product);
//    List<Product> createProducts( List<Product> products);

}
