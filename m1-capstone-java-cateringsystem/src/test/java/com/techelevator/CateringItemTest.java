package com.techelevator;

import org.junit.*;

public class CateringItemTest {
	
	private CateringItem tester;
	
	
	
	
	@Test
	public void catering_item_test_for_dessert() {
		tester = new CateringItem("D2", "Cake", 2.50, "D");
		Assert.assertEquals("Quantity minus 5:", 45, tester.purchaseItem(5));
		Assert.assertEquals("D is for Dessert", "Dessert", tester.getFoodType());

		
	}
	
	@Test
	public void catering_item_test_for_entrees() {
		tester = new CateringItem("E4", "Beef and Gravy", 5.15, "E");
		Assert.assertEquals("Quantity minus 25:", 25, tester.purchaseItem(25));
		Assert.assertEquals("Quantity minus 25 and 55:", -30, tester.purchaseItem(55));
		Assert.assertEquals("E equals Entree", "Entree", tester.getFoodType());
		
	}
	
	@Test
	public void catering_item_test_for_appetizer() {
		tester = new CateringItem("A3", "Bruschetta", 2.77, "A");
		Assert.assertEquals("Quantity minus 3:", 47, tester.purchaseItem(3));
		Assert.assertEquals("Quantity minus 3 and 10:", 37, tester.purchaseItem(10));
		Assert.assertEquals("A equals Appetizer", "Appetizer", tester.getFoodType());
		
	}
	
	@Test
	public void catering_item_test_for_beverage() {
		tester = new CateringItem("B1", "Beer", 6.75, "B");
		Assert.assertEquals("Quantity minus 7:", 43, tester.purchaseItem(7));
		Assert.assertEquals("Quantity minus 7 and 55:", -12, tester.purchaseItem(55));
		Assert.assertEquals("B equals Beverage", "Beverage", tester.getFoodType());
		
	}

}