package com.intelix.challenge.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelix.challenge.app.documents.Sale;
import com.intelix.challenge.app.repositorys.SaleRepository;

import reactor.core.publisher.Flux;

@Service
public class SaleService {

	SaleRepository saleRepository;

	@Autowired
	public SaleService(SaleRepository saleRepository) {
		this.saleRepository = saleRepository;
	}

	public Flux<Sale> findAllDocuments() {
		return saleRepository.findAll();
	}

}
