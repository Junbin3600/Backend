package com.topex.Virtual_Stock_Api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "order_items")
@Getter
@Setter
@ToString
public class OrderItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "supplier_sku_reference")
    private String supplierSkuReference;

    @Column(name = "retailer_sku_reference")
    private String retailerSkuReference;
    

    @Column(name = "retailer_additional_reference")
    private String retailerAdditionalReference;
    @Column(name = "line_reference")
    private String lineReference;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "unit_cost_price")
    private String unitCostPrice;
    @Column(name = "subtotal")
    private String subtotal;

    @Column(name = "tax_rate")
    private String taxRate;

    @Column(name = "tax")
    private String tax;

    @Column(name = "total")
    private String total;

    @Column(name = "promised_date")
    private String promisedDate;
    @ManyToOne
    @JsonIgnore
    private Supplier supplier;
    
    

}
