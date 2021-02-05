package com.techelevator;

public abstract class CateringItem {
	private Double price;
	private String name;
	private int numOfCateringItems = 50;

	
	/**This is the constructor.*/
	public CateringItem(String name, Double price) {
		this.name = name;
		this.price = price;
		
	}


	public Double getPrice() {
		return price;
	}


	public String getName() {
		return name;
	}

	public int getNumOfCateringItems() {
		return numOfCateringItems;
	}
	
	public boolean isAvailableToPurchase() {
		if(this.numOfCateringItems >= 1) {
			return true;
		}
		return false;
	}
	
	public void purchaseItem() {
		numOfCateringItems -= 1;
		
	}

	
	
	

}
