package com.test.nitin.repository;

import com.test.nitin.model.Product;

public interface ProductRepo {
	public Product getProdRepo(String prodId);

	public Product addProdRepo(Product prod);
	
	public Product updateProdRepo(String prodId, Product prod);
	
	public String deleteProdRepo(String ProdId);
}
