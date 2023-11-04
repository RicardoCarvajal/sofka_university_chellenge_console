package com.intelix.challenge.app.documents;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "sales")
@Getter
@Setter
@NoArgsConstructor
public class Sale {

	@Id
	private String _id;
	@Field("items")
	private List<Product> products;
	private String storeLocation;
	private Customer customer;
	private boolean couponUsed;
	private String purchaseMethod;
	private BigDecimal total;

}
