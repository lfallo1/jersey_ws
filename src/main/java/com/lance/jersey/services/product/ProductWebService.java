package com.lance.jersey.services.product;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@Path("products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductWebService {

	@Autowired
	private ProductService productService;
	
	@GET
	public ResponseEntity<List<Product>> getProducts(){
		return new ResponseEntity<>(this.productService.getAll(), HttpStatus.OK);
	}
	
	@GET
	@Path("/{id}")
	public ResponseEntity<Product> findById(@PathVariable("id") Integer id){
		return new ResponseEntity<>(new Product(id, "someProduct", 99.00), HttpStatus.OK);
	}
	
	@POST
	public ResponseEntity<Integer> addProduct(@RequestBody Product product){
		System.out.println("adding product: " + product.toString());
		return new ResponseEntity<>(1, HttpStatus.OK);
	}
	
}
