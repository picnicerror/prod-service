package com.test.nitin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.nitin.model.Product;
import com.test.nitin.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	@Autowired
	private ProductService productservice;

	@GetMapping("/prod/{prodId}")
	public ResponseEntity<Product> getProd(@PathVariable String prodId) {

		return new ResponseEntity<>(productservice.getProd(prodId), HttpStatus.OK);
	}

	@PostMapping("/prod")
	public ResponseEntity<Product> saveProd(@RequestBody Product prod) {

		return new ResponseEntity<>(productservice.addProd(prod), HttpStatus.OK);
	}

	@PutMapping("/prod/{prodId}")
	public ResponseEntity<Product> updateProd(@PathVariable String prodId, @RequestBody Product prod) {

		return new ResponseEntity<>(productservice.updateProd(prodId, prod), HttpStatus.OK);
	}

	@DeleteMapping("/prod/{prodId}")
	public ResponseEntity<String> removeProd(@PathVariable String prodId) {

		return new ResponseEntity<>(productservice.deleteProd(prodId), HttpStatus.OK);
	}
}
