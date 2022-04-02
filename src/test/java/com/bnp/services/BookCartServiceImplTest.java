package com.bnp.services;

import java.util.ArrayList;
import java.util.List;

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
		List<ShoppingCartItem> listshoppingCartItem = new ArrayList<ShoppingCartItem>();
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem);
		double actualPrice = service.calculatePrice(listshoppingCartItem);
		Assertions.assertEquals(Double.valueOf("50.0"), actualPrice);
	}

	@Test
	public void normalPriceWhenBuyTwoSameBook() {
		List<ShoppingCartItem> listshoppingCartItem = new ArrayList<ShoppingCartItem>();
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("2"));
		listshoppingCartItem.add(shoppingCartItem);
		double actualPrice = service.calculatePrice(listshoppingCartItem);
		Assertions.assertEquals(Double.valueOf("100.0"), actualPrice);
	}

	@Test
	public void normalPriceWhenBuyMoreSameBook() {
		List<ShoppingCartItem> listshoppingCartItem = null;
		listshoppingCartItem = new ArrayList<ShoppingCartItem>();
		double actualPrice = 0.0;
		ShoppingCartItem shoppingCartItem = null;
		shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("3"));
		listshoppingCartItem.add(shoppingCartItem);
		actualPrice = service.calculatePrice(listshoppingCartItem);

		listshoppingCartItem = new ArrayList<ShoppingCartItem>();
		Assertions.assertEquals(Double.valueOf("150.0"), actualPrice);
		shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("4"));
		listshoppingCartItem.add(shoppingCartItem);
		actualPrice = service.calculatePrice(listshoppingCartItem);
		Assertions.assertEquals(Double.valueOf("200.0"), actualPrice);

		listshoppingCartItem = new ArrayList<ShoppingCartItem>();
		shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("5"));
		listshoppingCartItem.add(shoppingCartItem);
		actualPrice = service.calculatePrice(listshoppingCartItem);
		Assertions.assertEquals(Double.valueOf("250.0"), actualPrice);

	}

	@Test
	public void fivePriceDiscountWhenBuytwoDifferentBook() {
		List<ShoppingCartItem> listshoppingCartItem = new ArrayList<ShoppingCartItem>();
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem);

		ShoppingCartItem shoppingCartItem1 = new ShoppingCartItem();
		shoppingCartItem1.setBookId(Integer.valueOf("2"));
		shoppingCartItem1.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem1);
		double actualPrice = service.calculatePrice(listshoppingCartItem);
		Assertions.assertEquals(Double.valueOf("95.0"), actualPrice);
	}

}
