package com.prugio.command.repository;

import com.prugio.command.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Long > {
}
