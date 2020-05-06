/**
 * 
 */
package com.exemple.wsdl.core;

import com.exemple.domain.Product;
import com.exemple.services.ProductService;
import com.exemple.wsdl.IProduct;
import com.exemple.wsdl.core.domain.ProductInput;

/**
 * @author Damião Ferreira
 * @since 06/05/2020
 *
 */
public class ProductImp implements IProduct{
	
	private ProductService productService;
	
	public ProductImp() {
		productService = new ProductService();
	}
	
	@Override
	public Product getProduct(long id) {
		return productService.getProduct(id);
	}

	@Override
	public Product addProduct(ProductInput productInput) {
		Product product = new Product(productInput.getName(), productInput.getDescription());
		return productService.addProduct(product);
	}

	@Override
	public boolean removeProduct(long id) {

		return productService.removeProduct(id);
	}

	@Override
	public Product updateProduct(Product product) {
		return productService.updateProduct(product);
	}

	@Override
	public Product[] getProducts() {
		return productService.getProducts();
	}
	
}
