package com.filterProject.example.demoFilterAndSearchProject.repository;

import com.filterProject.example.demoFilterAndSearchProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
//    @Query("SELECT p FROM Product p WHERE "+
//    "p.name LIKE CONCAT('%',:query,'%')"+
//    "p.description LIKE CONCAT('%',:query,'%')")


    //This os JPQL QUERY
    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%', :query, '%') OR " +
            "p.productDescription LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts (String query);

    //USing Native Query alos we can do this
//    @Query("SELECT * FROM table_name p WHERE " +
//            "p.name LIKE CONCAT('%', :query, '%') OR " +
//            "p.productDescription LIKE CONCAT('%', :query, '%')",nattiveQuery=true)
//    List<Product> productListSQL (String query);

}
