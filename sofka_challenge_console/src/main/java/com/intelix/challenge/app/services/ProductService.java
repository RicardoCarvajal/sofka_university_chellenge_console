package com.intelix.challenge.app.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.intelix.challenge.app.repositorys.ProductRepository;

public class ProductService {

	ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

}
