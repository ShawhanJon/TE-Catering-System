package com.techelevator;

import java.io.FileNotFoundException;

import com.techelevator.view.UserInterface;

public class CateringSystemCLI {

	private UserInterface ui;

	public CateringSystemCLI(UserInterface ui) {
		this.ui = ui;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		InventoryLoader inventoryLoader = new InventoryLoader();
		inventoryLoader.loadInventoryFromFile();
		Inventory inventory = new Inventory ();
		
		System.out.println(inventory.retrieveListOfCateringItems());
		
		
		
		
		
		
		
		//UserInterface menu = new UserInterface();
		//CateringSystemCLI cli = new CateringSystemCLI(menu);
		//cli.run();
	}	

	
	
	public void run() {
		
		//choice
			//variable
			//If else statement
		
		//new inventory
		
		// print main menu
		
		//print sub menu
		
		// Get cart items
		
		// Check Item Availability
		
		// update purchase log
		
		
		
		

	}
	
	



}
