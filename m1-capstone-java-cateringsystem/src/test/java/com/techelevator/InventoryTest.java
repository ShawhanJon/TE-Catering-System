package com.techelevator;

import com.techelevator.Inventory;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class InventoryTest {
	
	private Inventory inventory;
	
	
	
	@Before
	public void testInventory() throws FileNotFoundException {
		inventory = new Inventory();
	}
	
	@Test
	public void testCheckAvailabilityOfItem() {
		
	}
	
	@Test
	public void testGetItemName() {
		
	}
	
}