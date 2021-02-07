package com.techelevator;

public class CateringItem {
	private double price;
	private String name;
	private int numOfCateringItems = 50;
	private String itemId;
	private String foodType;

	
	/**This is the constructor.*/
	public CateringItem(String itemId, String name, double price, String foodType) {
		this.name = name;
		this.price = price;
		this.itemId = itemId;
		this.foodType = foodType;
		
	}


	public double getPrice() {
		return price;
	}


	public String getName() {
		return name;
	}

	public int getNumOfCateringItems() {
		return numOfCateringItems;
	}
	
	public boolean itemAvailable() {
		if(this.numOfCateringItems >= 1) {
			return true;
		}
		return false;
	}
	
	public int purchaseItem(int i) {
		return numOfCateringItems -= i;
		
	}
	
	public String getQuantityString() {
		if(this.getNumOfCateringItems() == 0) {
			return "SOLD OUT";
		} else {
			return String.valueOf(this.getNumOfCateringItems());
		}
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getFoodType() {
		if (foodType.equals("B")) {
			return "Beverage";
		}else if (foodType.equals("E")) {
			return "Entree";
		}else if(foodType.equals("D")) {
			return "Dessert";
		} else {
			return "Appetizer";
		}
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	
	
	

}
