package com.projit.storeApp.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDto {
	private CartProductDto product;
	private int quantity;
	private BigDecimal totalPrice;
}
