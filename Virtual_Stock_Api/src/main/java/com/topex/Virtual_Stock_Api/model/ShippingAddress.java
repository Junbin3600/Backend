package com.topex.Virtual_Stock_Api.model;


import javax.persistence.Column;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ShippingAddress {
    

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "line_1")
    private String line1;

    @Column(name = "line_2")
    private String line2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "country")
    private String country;
     @JsonIgnore
    @OneToOne
    private Supplier supplier;

    

   
}

