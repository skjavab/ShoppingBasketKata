package com.bnp.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bnp.model.ShoppingCartItem;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class BookCartServiceImplTest {

	private BookCartServiceImpl service = new BookCartServiceImpl();;

	@Test
	public void normalPriceWhenBuyOneBook() {
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("1"));
		double actualPrice = service.calculatePrice(shoppingCartItem);
		Assertions.assertEquals(Double.valueOf("50.0"), actualPrice);
	}

	@Test
	public void normalPriceWhenBuyTwoSameBook() {
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("2"));
		double actualPrice = service.calculatePrice(shoppingCartItem);
		Assertions.assertEquals(Double.valueOf("100.0"), actualPrice);
	}

}
