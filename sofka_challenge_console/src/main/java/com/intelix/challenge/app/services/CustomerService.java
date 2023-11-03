package com.intelix.challenge.app.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.intelix.challenge.app.repositorys.CustomerRepository;

public class CustomerService {

	CustomerRepository customerRepository;

	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
