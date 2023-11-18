package com.topex.Virtual_Stock_Api.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Product {
	@Id	
	private Integer PartNumber;
	private String category;
	private String client;
	private String supplier;
	@Embedded
	private Suppliers suppliers;

}
