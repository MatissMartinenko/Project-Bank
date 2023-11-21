package com.projectbank.service;

import com.projectbank.entity.Product;

import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(String id);

}
