package com.springbootmicroservices.productservice.repository;

import com.springbootmicroservices.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
