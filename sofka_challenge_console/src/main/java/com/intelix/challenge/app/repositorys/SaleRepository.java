package com.intelix.challenge.app.repositorys;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.intelix.challenge.app.documents.Sale;

public interface SaleRepository extends ReactiveMongoRepository<Sale, String> {

}
