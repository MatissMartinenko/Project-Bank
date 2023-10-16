package com.pojectbank.controller;

import com.pojectbank.dto.ProductDto;
import com.pojectbank.entity.Product;
import com.pojectbank.mapper.ProductMapper;
import com.pojectbank.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;

    @GetMapping("/get/{id}")
    public ProductDto getProduct(@PathVariable("id") String id){
        Optional<Product> opt = productService.findById(id);

        if (opt.isPresent()){
            return productMapper.productToDto(opt.get());
        }
        throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
