package com.intelix.challenge.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelix.challenge.app.documents.Product;
import com.intelix.challenge.app.documents.SaleProduct;
import com.intelix.challenge.app.repositorys.SaleProductRepository;
import com.intelix.challenge.app.repositorys.SaleRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class SaleProductService {

	SaleProductRepository saleProductRepository;
	SaleRepository saleRepository;

	@Autowired
	public SaleProductService(SaleProductRepository saleProductRepository, SaleRepository saleRepository) {
		this.saleProductRepository = saleProductRepository;
		this.saleRepository = saleRepository;
	}

	public List<SaleProduct> saveDocuments(List<SaleProduct> product) {
		return saleProductRepository.saveAll(product);
	}

	public void createCollections() {
		List<Product> products = new ArrayList<>();

		List<SaleProduct> saleProducts = new ArrayList<>();

		saleRepository.findAll().forEach(sale -> {
			products.addAll(sale.getProducts());
		});

		products.stream().collect(Collectors.groupingBy(Product::getName, Collectors.toList()))
				.forEach((name, productos) -> {
					log.info("Nombre de articulo: " + name + " Numero de veces vendido: " + productos.size());
					saleProducts.add(SaleProduct.builder().productName(name).quantity(productos.size()).build());
				});

		saveDocuments(saleProducts).forEach(pro -> log.info("Producto creado: " + pro.getProductName().toUpperCase()));
	}

}
