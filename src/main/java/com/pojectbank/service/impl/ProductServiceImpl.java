package com.pojectbank.service.impl;

import com.pojectbank.entity.Product;
import com.pojectbank.repository.ProductRepository;
import com.pojectbank.service.ProductService;
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
