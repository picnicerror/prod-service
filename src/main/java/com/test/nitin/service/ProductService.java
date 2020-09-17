package com.test.nitin.service;

import com.test.nitin.model.Product;

public interface ProductService {
	public Product getProd(String prodId);

	public Product addProd(Product prod);
	
	public Product updateProd(String prodId, Product prod);
	
	public String deleteProd(String ProdId);
}
