package com.intelix.challenge.app.repositorys;

import java.util.UUID;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.intelix.challenge.app.documents.Customer;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, UUID> {

}
