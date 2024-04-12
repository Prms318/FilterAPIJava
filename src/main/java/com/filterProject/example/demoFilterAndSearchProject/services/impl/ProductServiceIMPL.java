package com.filterProject.example.demoFilterAndSearchProject.services.impl;

import com.filterProject.example.demoFilterAndSearchProject.entity.Product;
import com.filterProject.example.demoFilterAndSearchProject.repository.ProductRepository;
import com.filterProject.example.demoFilterAndSearchProject.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceIMPL implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceIMPL(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
       List<Product> productList= productRepository.searchProducts(query);
       return productList;

    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

//    @Override
//    public List<Product> createProducts(List<Product> products) {
//        return productRepository.saveAll(products);
//    }
}
