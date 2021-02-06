package com.techelevator.view;

import java.util.List;
import java.util.Scanner;

import com.techelevator.CateringItem;

public class UserInterface{
	
	
	
private Scanner scanner;
	
	public UserInterface() {
		scanner = new Scanner(System.in);
	}
	
	/**
	 * This method prints the main UI to the console
	 * 
	 * @return user choice
	 */
	
	public String printMainMenu() {

		System.out.println("***************************");
		System.out.println("JJ's Catering App");
		System.out.println("***************************\n");

		System.out.println("1. Display Catering Items");
		System.out.println("2. Order");
		System.out.println("3. Quit");
		

		System.out.println("Please select your choice (number only)");

		return scanner.nextLine();

	}
	
	 /**
     * This method prints out a list of catering items 
     * @param List<CateringItem> cateringItems - An ArrayList containing our list of catering items 
    */
	public void printListOfCateringItems(List<CateringItem> cateringItems) {
		//TODO: Group items based on Product codes.

		
		System.out.println("\n*********** List of Items Avaliable ************\n");
		
		
		if (cateringItems.isEmpty()) {
			System.out.println("No Items avaliable!");
			return;
		}

		for (CateringItem cateringitem : cateringItems) {
			
			printCateringItem(cateringitem);

		}

	}
	/**
	 * This method prints out a single home.  We 'could' have put this up in the for each loop above, but breaking
	 * it out on it's own keeps the code above cleaner AND we can also reuse when printing out the home from menu option 2
	 *  
	 * @param home
	 */
	public void printCateringItem(CateringItem cateringitem) {
		
		System.out.println("Catering Item Name: " + cateringitem.getClass().getSimpleName() + " | " + cateringitem.getName());
		System.out.println(String.format("%-25s %s", "Quantity: ", cateringitem.getNumOfCateringItems()));
		System.out.println(String.format("%-25s $%s", "Price: ", String.format("%.2f", cateringitem.getPrice())));

		
		System.out.println("\n*********** *** *** ***************\n");		
		
	}
	
	public void makeOrder() {
		
	}
	


	
	
	
	
	

	
	
    //Main Menu
		//1. Display Catering Items
			//load inventory items
				
		//2. Order
			//display SubMenu
	
		//3. Quit
				
	
	
	
	
	
	
	
	
			//**SubMenu**
				//1. Add Money
					//add up to $5000
					//Current Account Balance
	
				//2. Select Products
					//(1. Display Catering Items)
					//Select Product via Product ID & Quantity
					//Update Account Balance and Stock
					//Return to Order Menu
	
				//3. Complete Transaction
					//Receive Report Of Products Ordered
					//Return Customer Money
					//Account Balance equals 0
	
				//Current Account Balance
	
}
