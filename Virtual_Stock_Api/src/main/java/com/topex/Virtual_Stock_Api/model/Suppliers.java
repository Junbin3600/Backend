package com.topex.Virtual_Stock_Api.model;
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
public class Suppliers {
private Integer supplierPartNumber;
private String freeStock;
private String uom;
private Integer lowstock;

}
