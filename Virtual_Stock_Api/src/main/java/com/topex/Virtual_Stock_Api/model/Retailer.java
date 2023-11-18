package com.topex.Virtual_Stock_Api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity

public class Retailer {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer count;	    
	    private String next;
	    private String previous;
	    @OneToMany( cascade = CascadeType.ALL,mappedBy = "retailer")
	    private List<RetailerList> results;
	    
	    
	   
}
