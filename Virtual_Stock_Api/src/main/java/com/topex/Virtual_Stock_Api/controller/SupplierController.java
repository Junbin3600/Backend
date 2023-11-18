package com.topex.Virtual_Stock_Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.topex.Virtual_Stock_Api.model.AcknowlegeOrder;
import com.topex.Virtual_Stock_Api.model.Backorder;
import com.topex.Virtual_Stock_Api.model.Cancellation;
import com.topex.Virtual_Stock_Api.model.DispatchOrder;
import com.topex.Virtual_Stock_Api.model.Retailer;
import com.topex.Virtual_Stock_Api.model.Supplier;
import com.topex.Virtual_Stock_Api.service.RetailerService;

@RestController
@RequestMapping("/api/v4/supplier")
public class SupplierController {
	@Autowired
	private RetailerService service;
	
	@PostMapping
	public ResponseEntity<Retailer> addRetailerHandler(@RequestBody Retailer retailer){
		return new ResponseEntity<>(service.addRetailer(retailer),HttpStatus.ACCEPTED);
	}
	
	@GetMapping
	public ResponseEntity<List<Supplier>> findAllOrderHandler(){
		return new ResponseEntity<>(service.getAllOrders(),HttpStatus.OK);
	}
	@GetMapping("/{Id}")
	public ResponseEntity<Supplier> findAllOrderByIdeHandler(@PathVariable Integer Id){
		return new ResponseEntity<>(service.findOrderByiD(Id),HttpStatus.OK);
	}
	@PostMapping("/ack")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public AcknowlegeOrder addOrderhandler(@RequestBody AcknowlegeOrder order) {
		return service.addOrder(order);
	}
     @GetMapping("/ack/list")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public List<AcknowlegeOrder> findAllAckOrderList() {
		return service.findAllAckOrder();
	}
     @PostMapping("/bck")
  	@ResponseStatus(code = HttpStatus.ACCEPTED)
  	public Backorder addBckOrderhandler(@RequestBody Backorder  order) {
  		return service.addOrder(order);
  	}
     @PostMapping("/cancel")
    	@ResponseStatus(code = HttpStatus.ACCEPTED)
    	public Cancellation addCancellationkOrderhandler(@RequestBody Cancellation  order) {
    		return service.addOrder(order);
    	}
     
     @PostMapping("/dispatch")
    	@ResponseStatus(code = HttpStatus.ACCEPTED)
    	public DispatchOrder addDispathOrderHandler(@RequestBody DispatchOrder  order) {
    		return service.adddispatch(order);
    	}
     
     
     

}
