package com.springbootmicroservices.productservice.service;

import org.springframework.stereotype.Service;

import com.springbootmicroservices.productservice.dto.ProductRequest;
import com.springbootmicroservices.productservice.model.Product;
import com.springbootmicroservices.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    // public ProductService(ProductRepository productRepository) { => @RequiredArgsConstructor
    //     this.productRepository = productRepository;
    // }

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder().name(productRequest.getName()).description(productRequest.getDescription())
                .price(productRequest.getPrice()).build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }
}
