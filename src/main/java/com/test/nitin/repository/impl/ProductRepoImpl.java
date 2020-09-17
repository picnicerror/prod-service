package com.test.nitin.repository.impl;

import org.springframework.stereotype.Repository;

import com.test.nitin.common.DummyProductDB;
import com.test.nitin.model.Product;
import com.test.nitin.repository.ProductRepo;

@Repository("prodrepo")
public class ProductRepoImpl implements ProductRepo {

	@SuppressWarnings("static-access")
	@Override
	public Product getProdRepo(String prodId) {
		// TODO Auto-generated method stub
		return (Product) DummyProductDB.getInstance().map.get(prodId);

	}

	@SuppressWarnings("static-access")
	@Override
	public Product addProdRepo(Product prod) {
		// TODO Auto-generated method stub
		return (Product) DummyProductDB.getInstance().map.put(prod.getProdId(), prod);
	}

	@SuppressWarnings("static-access")
	@Override
	public Product updateProdRepo(String prodId, Product prod) {
		// TODO Auto-generated method stub
		return (Product) DummyProductDB.getInstance().map.put(prod.getProdId(), prod);
	}

	@SuppressWarnings("static-access")
	@Override
	public String deleteProdRepo(String ProdId) {
		// TODO Auto-generated method stub
		DummyProductDB.getInstance().map.remove(ProdId);

		String s= "Prod Id" + ProdId + "deleted successfully";
		return s;
	}

}
