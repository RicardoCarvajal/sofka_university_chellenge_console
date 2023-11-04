package com.intelix.challenge.app.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intelix.challenge.app.documents.Sale;

public interface SaleRepository extends MongoRepository<Sale, String> {

}
