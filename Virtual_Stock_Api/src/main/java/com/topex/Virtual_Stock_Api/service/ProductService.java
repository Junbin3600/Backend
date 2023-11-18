package com.topex.Virtual_Stock_Api.service;

import java.util.List;

import com.topex.Virtual_Stock_Api.exception.ProductException;
import com.topex.Virtual_Stock_Api.model.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public Product updateProduct(Product product,Integer id)throws ProductException;
	public Integer totalStock()throws ProductException;
	public List<Product> findallProduct()throws ProductException;

}
