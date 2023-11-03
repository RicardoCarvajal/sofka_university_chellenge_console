package com.intelix.challenge.app.documents;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Customer {

	@Id
	private UUID _id;
	private char gender;
	private int age;
	private String email;
	private int satisfaction;

}
