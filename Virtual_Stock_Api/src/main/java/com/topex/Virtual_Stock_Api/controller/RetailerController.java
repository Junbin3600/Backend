package com.topex.Virtual_Stock_Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.topex.Virtual_Stock_Api.model.Product;
import com.topex.Virtual_Stock_Api.model.Supplier;
import com.topex.Virtual_Stock_Api.service.SupplierService;

@RestController
@RequestMapping("/api/v4/order")
public class RetailerController {
	@Autowired
	private SupplierService service;
	
	@PostMapping("/add")
	public ResponseEntity<Supplier> addSupplierHandler(@RequestBody Supplier supplier){
		return new ResponseEntity<>(service.createSupplier(supplier),HttpStatus.ACCEPTED);
	}
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<Supplier> findallProductHandler(){
		return service.getAllOrder();
	}

}
