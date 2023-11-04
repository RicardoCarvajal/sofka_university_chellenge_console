package com.intelix.challenge.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelix.challenge.app.documents.SaleProduct;
import com.intelix.challenge.app.repositorys.SaleProductRepository;

@Service
public class SaleProductService {

	SaleProductRepository saleProductRepository;

	@Autowired
	public SaleProductService(SaleProductRepository saleProductRepository) {
		this.saleProductRepository = saleProductRepository;
	}

	public List<SaleProduct> saveDocuments(List<SaleProduct> product) {
		return saleProductRepository.saveAll(product);
	}

}
