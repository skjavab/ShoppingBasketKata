package com.bnp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartItem implements Comparable<ShoppingCartItem> {
	private Integer bookId;
	private Integer quantity;;

	@Override
	public int compareTo(ShoppingCartItem arg) {
		if (getQuantity() == null || arg.getQuantity() == null) {
			return 0;
		}
		return getQuantity().compareTo(arg.getQuantity());
	}
}
