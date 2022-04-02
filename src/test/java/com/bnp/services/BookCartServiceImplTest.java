package com.bnp.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class BookCartServiceImplTest {

	private BookCartServiceImpl service = new BookCartServiceImpl();;

	@Test
	public void normalPriceWhenBuyOneBook() {
		double actualPrice = service.calculatePrice("1");
		Assertions.assertEquals(Double.valueOf("50.0"), actualPrice);
	}

}
