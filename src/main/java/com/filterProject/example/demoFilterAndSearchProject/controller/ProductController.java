package com.filterProject.example.demoFilterAndSearchProject.controller;

import com.filterProject.example.demoFilterAndSearchProject.entity.Product;
import com.filterProject.example.demoFilterAndSearchProject.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return  ResponseEntity.ok(productService.searchProducts(query));
    }
    @PostMapping("/createProduct")
    public Product createProduct(@RequestBody  Product product ){
        return productService.createProduct(product);

    }

//    @PostMapping("/createProducts")
//    public List<Product> createProducts(@RequestBody List<Product> products) {
//        return productService.createProducts(products);
//    }

}
