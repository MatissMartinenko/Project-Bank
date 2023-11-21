package com.projectbank.service.impl;

import com.projectbank.entity.Product;
import com.projectbank.repository.ProductRepository;
import com.projectbank.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;


    @Override
    public Optional<Product> findById(String id) {
        return Optional.empty();
    }
}
