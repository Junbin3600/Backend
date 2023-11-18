package com.topex.Virtual_Stock_Api.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topex.Virtual_Stock_Api.exception.OrderException;
import com.topex.Virtual_Stock_Api.model.AcknowlegeOrder;
import com.topex.Virtual_Stock_Api.model.Backorder;
import com.topex.Virtual_Stock_Api.model.Cancellation;
import com.topex.Virtual_Stock_Api.model.DispatchOrder;
import com.topex.Virtual_Stock_Api.model.Retailer;
import com.topex.Virtual_Stock_Api.model.Supplier;
import com.topex.Virtual_Stock_Api.repo.AcknowlegeOrderRepo;
import com.topex.Virtual_Stock_Api.repo.BackOrderRepo;
import com.topex.Virtual_Stock_Api.repo.CancellationRepo;
import com.topex.Virtual_Stock_Api.repo.DispatchOrderRepo;
import com.topex.Virtual_Stock_Api.repo.RetailerRepo;
import com.topex.Virtual_Stock_Api.repo.SupplierRepository;



@Service
public class RetailerService {
	
	@Autowired
	private RetailerRepo repo;
	@Autowired
	private BackOrderRepo bckrepo;	
	
	@Autowired
    private SupplierRepository srepo;
	@Autowired
	private AcknowlegeOrderRepo ackOrderRepo;
	@Autowired
	private CancellationRepo cancelrepo;
	@Autowired
	private DispatchOrderRepo dispatchrepo;
	
	public Retailer addRetailer(Retailer retailer) {
		return repo.save(retailer);
	}
	
	
	public List<Supplier> getAllOrders(){
		List<Supplier> list=srepo.findAll();
		if(list.isEmpty())throw new OrderException("No Order Found");
		return list;
		
	}
	 
	public Supplier findOrderByiD(Integer id) {
		return srepo.findById(id).orElseThrow(()->new OrderException("Order not found by This Id"+id));
	}
	
	
	public AcknowlegeOrder addOrder(AcknowlegeOrder order) {
		order.setSupplierDispatchDate(LocalDateTime.now());
		return ackOrderRepo.save(order);
	}
	public List<AcknowlegeOrder> findAllAckOrder() throws OrderException{
		List<AcknowlegeOrder> list=ackOrderRepo.findAll();
		if(list.isEmpty()) {
			throw new OrderException("No Order is found");
		}
		return list;
	}
	
	
	public Backorder addOrder(Backorder order) {
		order.setSupplierDispatchDate(LocalDateTime.now());
		return bckrepo.save(order);
	}
	
	

	
	public Cancellation addOrder(Cancellation order) {
		
		return cancelrepo.save(order);
	}
	
	
	public DispatchOrder adddispatch(DispatchOrder order) {
		order.setSupplierDispatchDate(LocalDateTime.now());
		return dispatchrepo.save(order);
	}
	
	

}
