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

	@Test
	public void tenPriceDiscountWhenBuyThreeDifferentBook() {
		List<ShoppingCartItem> listshoppingCartItem = new ArrayList<ShoppingCartItem>();
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem);

		ShoppingCartItem shoppingCartItem1 = new ShoppingCartItem();
		shoppingCartItem1.setBookId(Integer.valueOf("2"));
		shoppingCartItem1.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem1);

		ShoppingCartItem shoppingCartItem2 = new ShoppingCartItem();
		shoppingCartItem2.setBookId(Integer.valueOf("3"));
		shoppingCartItem2.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem2);
		double actualPrice = service.calculatePrice(listshoppingCartItem);
		Assertions.assertEquals(Double.valueOf("135.0"), actualPrice);
	}

	@Test
	public void twentyPriceDiscountWhenBuyFourDifferentBook() {
		List<ShoppingCartItem> listshoppingCartItem = new ArrayList<ShoppingCartItem>();
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem);

		ShoppingCartItem shoppingCartItem1 = new ShoppingCartItem();
		shoppingCartItem1.setBookId(Integer.valueOf("2"));
		shoppingCartItem1.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem1);

		ShoppingCartItem shoppingCartItem2 = new ShoppingCartItem();
		shoppingCartItem2.setBookId(Integer.valueOf("3"));
		shoppingCartItem2.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem2);

		ShoppingCartItem shoppingCartItem3 = new ShoppingCartItem();
		shoppingCartItem3.setBookId(Integer.valueOf("4"));
		shoppingCartItem3.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem3);
		double actualPrice = service.calculatePrice(listshoppingCartItem);

		Assertions.assertEquals(Double.valueOf("160.0"), actualPrice);
	}

	@Test
	public void twentyFivePriceDiscountWhenBuyFiveDifferentBook() {
		List<ShoppingCartItem> listshoppingCartItem = new ArrayList<ShoppingCartItem>();
		ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(Integer.valueOf("1"));
		shoppingCartItem.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem);

		ShoppingCartItem shoppingCartItem1 = new ShoppingCartItem();
		shoppingCartItem1.setBookId(Integer.valueOf("2"));
		shoppingCartItem1.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem1);

		ShoppingCartItem shoppingCartItem2 = new ShoppingCartItem();
		shoppingCartItem2.setBookId(Integer.valueOf("3"));
		shoppingCartItem2.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem2);

		ShoppingCartItem shoppingCartItem3 = new ShoppingCartItem();
		shoppingCartItem3.setBookId(Integer.valueOf("4"));
		shoppingCartItem3.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem3);
		
		ShoppingCartItem shoppingCartItem4 = new ShoppingCartItem();
		shoppingCartItem4.setBookId(Integer.valueOf("5"));
		shoppingCartItem4.setQuantity(Integer.valueOf("1"));
		listshoppingCartItem.add(shoppingCartItem4);
		double actualPrice = service.calculatePrice(listshoppingCartItem);

		Assertions.assertEquals(Double.valueOf("187.5"), actualPrice);
	}

}
