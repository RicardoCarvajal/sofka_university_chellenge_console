package com.intelix.challenge.app.documents;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {

	@Id
	private UUID _id;
	private String name;
	private List<String> tags;
	private BigDecimal price;
	private Integer quantity;

}
