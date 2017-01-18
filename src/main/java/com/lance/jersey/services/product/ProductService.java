package com.lance.jersey.services.product;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<Product> getAll() {
		return Arrays.asList(new Product(1, "iPhone", 199.99), new Product(2, "Galaxy S7", 248.99));
	}

}
