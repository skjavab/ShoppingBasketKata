
package com.bnp.services;

import org.springframework.stereotype.Service;

import com.bnp.model.ShoppingCartItem;

@Service
public class BookCartServiceImpl {

	public double calculatePrice(ShoppingCartItem shoppingCartItem) {
		return 50.0 * shoppingCartItem.getQuantity();

	}

}
