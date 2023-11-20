package com.topex.Virtual_Stock_Api.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topex.Virtual_Stock_Api.model.Supplier;
import com.topex.Virtual_Stock_Api.repo.SupplierRepository;
@Service
public  class SupplierService  {
	@Autowired
     private SupplierRepository repo;



	public Supplier createSupplier(Supplier suplier) {
		// TODO Auto-generated method stub
		
		suplier.setOrderDate(LocalDate.now());
		return repo.saveAndFlush(suplier);
	}
	
		public  List<Supplier>  getAllOrder(){
		 List<Supplier> list=repo.findAll();
		 if(list.isEmpty())throw new SupplierException("No Order Found");
		return list;
	}
	

}
