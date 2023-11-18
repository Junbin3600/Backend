package com.topex.Virtual_Stock_Api.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
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

public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String supplierName;

	private String orderReference;

	private String additionalOrderReference;

	private LocalDate orderDate;

	private boolean testFlag;

	private String currencyCode;

	private String purchaseOrderReference;

	private String endUserPurchaseOrderReference;

	private String comment;

	private String subtotal;

	private String tax;

	private String total;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "supplier")
	private List<OrderItem> items;

	@Embedded
	private ShippingAddress shippingAddress;

}
