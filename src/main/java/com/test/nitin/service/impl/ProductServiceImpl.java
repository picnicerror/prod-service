package com.test.nitin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.nitin.model.Product;
import com.test.nitin.repository.ProductRepo;
import com.test.nitin.service.ProductService;
@Service("productservice")
public class ProductServiceImpl implements ProductService {
@Autowired
private ProductRepo productRepo;
	@Override
	public Product getProd(String prodId) {
		// TODO Auto-generated method stub
		return productRepo.getProdRepo(prodId);
	}

	@Override
	public Product addProd(Product prod) {
		// TODO Auto-generated method stub
		return productRepo.addProdRepo(prod);
	}

	@Override
	public Product updateProd(String prodId, Product prod) {
		// TODO Auto-generated method stub
		return productRepo.updateProdRepo(prodId, prod);
	}

	@Override
	public String deleteProd(String ProdId) {
		// TODO Auto-generated method stub
		return productRepo.deleteProdRepo(ProdId);
	}

}
