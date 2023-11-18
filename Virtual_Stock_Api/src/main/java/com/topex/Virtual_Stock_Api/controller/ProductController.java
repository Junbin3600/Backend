package com.topex.Virtual_Stock_Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.topex.Virtual_Stock_Api.model.Product;
import com.topex.Virtual_Stock_Api.service.ProductService;

@RestController
@RequestMapping("/api/v4/product")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Product addProductHandler(@RequestBody Product product) {
		return service.addProduct(product);
	}
	@PutMapping("/update/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Product updateProductHandler(@RequestBody Product product,Integer id) {
		return service.updateProduct(product, id);
	}
	@GetMapping("/stock")
	@ResponseStatus(code = HttpStatus.OK)
	public Integer findStockHandler() {
		return service.totalStock();
	}
	@GetMapping("/list")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Product> findallProductHandler(){
		return service.findallProduct();
	}

}
