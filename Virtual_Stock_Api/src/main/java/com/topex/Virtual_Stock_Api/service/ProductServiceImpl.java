package com.topex.Virtual_Stock_Api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topex.Virtual_Stock_Api.exception.ProductException;
import com.topex.Virtual_Stock_Api.model.Product;
import com.topex.Virtual_Stock_Api.repo.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo repo;

	@Override
	public Product addProduct(Product product) {
	
		return  repo.save(product);
	}

	@Override
	public Product updateProduct(Product product, Integer id) throws ProductException {
		// TODO Auto-generated method stub.
		Optional<Product> opt=repo.findById(id);
		if(opt.isPresent()) {
			Product updated=opt.get();
			updated.setCategory(product.getCategory());
			updated.setClient(product.getClient());
			updated.setPartNumber(product.getPartNumber());
			updated.setSuppliers(product.getSuppliers());
			updated.setSupplier(product.getSupplier());
			return repo.save(updated);
		}else {
			throw new ProductException("Product is not available with this Id: "+id);
		}
		
	}

	@Override
	public Integer totalStock() throws ProductException {
		List<Product> list=repo.findAll();
		if(list.isEmpty())throw new ProductException("No Stock is available ");
		return list.size();
	}

	@Override
	public List<Product> findallProduct() throws ProductException {
		List<Product> list=repo.findAll();
		if(list.isEmpty())throw new ProductException("No Stock is available ");
		return list;
	}

}
