package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	
	 List<CateringItem>purchasedItemsList = new ArrayList<CateringItem>();
	
	public void addToCart(CateringItem cateringItem) {
		
		purchasedItemsList.add(cateringItem);
		
	
	}
	
	
	

}
