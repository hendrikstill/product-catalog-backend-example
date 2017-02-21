package com.example;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import com.example.core.Product;

/**
 * ProductRepository
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
}