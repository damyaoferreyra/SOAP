package com.exemple.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.exemple.domain.Product;

/**
 * 
 * @author Damião Ferreira
 * @since 06/05/2020
 *
 */
public class ProductService {
	
	/**
	 * List product - DB fake
	 */
	static Map<Long, Product> products = new HashMap<>();;
	
	/*
	 * Id generation database fake
	 */
	static long id = 0;
	
	public ProductService() {

	}
	
	/**
	 * Salve product in database fake
	 * @param id
	 * @return Product
	 */
	public Product getProduct(long  id) {
		Product product = products.get(id);
		return product;
	}


	/**
	 * Add product in database fake
	 * @param product
	 * @return Product
	 */
	public Product addProduct(Product product) {
		product.setId(++id);
		products.put(product.getId(), product);
		return product;
	}
	
	/**
	 * Remove procuct database fake
	 * @param id
	 * @return true : success
	 */
	public boolean removeProduct(long id) {
		
		return products.remove(id) != null;
	}
	
	
	/**
	 * update to product  in database fake
	 * @param product
	 * @return Product
	 */
	public Product updateProduct(Product product) {
		
		if(product.getId() > 0) {
			product.setDateUpdate(new Date().toString()); 
			products.put(product.getId(), product);
			
			return product;
		}
		
		return null;
	}
	
	public Product[] getProducts() {
		ArrayList<Product> arrayList = new ArrayList<Product>();
		for(Entry<Long, Product> entrySet : products.entrySet()) {
			arrayList.add(entrySet.getValue());
		}
		
		return arrayList.toArray(new Product[arrayList.size()]);
	}
}
