package com.pojectbank.service;

import com.pojectbank.entity.Product;

import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(String id);

}
