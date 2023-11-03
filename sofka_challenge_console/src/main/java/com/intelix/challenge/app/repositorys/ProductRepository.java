package com.intelix.challenge.app.repositorys;

import java.util.UUID;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.intelix.challenge.app.documents.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, UUID> {

}
