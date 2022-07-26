package com.cart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private String name;
	private String code;
    private Long productId;
	private Double price;
	private Long stocks;
	private Long available;
	
}
