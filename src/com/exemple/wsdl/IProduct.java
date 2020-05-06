package com.exemple.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.exemple.domain.Product;
import com.exemple.wsdl.core.domain.ProductInput;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IProduct {

	@WebMethod
	Product getProduct(@WebParam(name = "product") long  id);
	
	@WebMethod
	Product addProduct(@WebParam(name = "product") ProductInput product);
	
	@WebMethod
	boolean removeProduct(@WebParam(name = "product") long id);
	
	@WebMethod
	Product updateProduct(@WebParam(name = "product") Product product);
	
	@WebMethod
	Product[] getProducts();
}
