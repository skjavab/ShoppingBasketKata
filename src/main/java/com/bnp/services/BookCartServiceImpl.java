
package com.bnp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bnp.model.ShoppingCartItem;

@Service
public class BookCartServiceImpl {

	public double calculatePrice(List<ShoppingCartItem> bookList) {
		double calculatedPrice = 0d;
		if (bookList != null) {
			if (bookList.size() == 1) {
				ShoppingCartItem shoppingCartItembook = bookList.get(0);
				return 50.0 * shoppingCartItembook.getQuantity();
			} else if (bookList.size() == 2) {
				double basePrice = bookList.size() * 50;
				double discountedPriceForSet = basePrice - ((basePrice * 5) / 100.0);
				calculatedPrice += discountedPriceForSet;
			} else if (bookList.size() == 3) {
				double basePrice = bookList.size() * 50;
				double discountedPriceForSet = basePrice - ((basePrice * 10) / 100.0);
				calculatedPrice += discountedPriceForSet;
			} else if (bookList.size() == 4) {
				double basePrice = bookList.size() * 50;
				double discountedPriceForSet = basePrice - ((basePrice * 20) / 100.0);
				calculatedPrice += discountedPriceForSet;
			}else if (bookList.size() == 5) {
				double basePrice = bookList.size() * 50;
				double discountedPriceForSet = basePrice - ((basePrice * 25) / 100.0);
				calculatedPrice += discountedPriceForSet;
			}
		}

		return calculatedPrice;

	}

}
