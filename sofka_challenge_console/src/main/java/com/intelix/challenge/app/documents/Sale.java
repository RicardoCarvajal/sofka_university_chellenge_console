package com.intelix.challenge.app.documents;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
	private List<Product> products;
	private String storeLocation;
	private Customer customer;
	private boolean couponUsed;
	private String purchaseMethod;

}
