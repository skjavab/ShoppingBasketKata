
package com.bnp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bnp.model.ShoppingCartItem;

@Service
public class BookCartServiceImpl {

	public double calculatePrice(List<ShoppingCartItem> bookList) {
		double calculatedPrice = 0d;
		if (bookList != null) {
			if (bookList.size() == 2) {
				double basePrice = bookList.size() * 50;
				double discountedPriceForSet = basePrice - ((basePrice * 5) / 100.0);
				calculatedPrice += discountedPriceForSet;
			}
		} else {
			ShoppingCartItem shoppingCartItembook = bookList.get(0);
			return 50.0 * shoppingCartItembook.getQuantity();
		}

		return calculatedPrice;

	}

}
