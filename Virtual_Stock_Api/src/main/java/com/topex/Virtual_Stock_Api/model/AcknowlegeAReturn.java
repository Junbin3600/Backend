package com.topex.Virtual_Stock_Api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
public class AcknowlegeAReturn {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	     private Integer id;
	    private String partNumber;
	    private String lineRef;
	    private Integer quantity;	    
	    private String comment;

}
