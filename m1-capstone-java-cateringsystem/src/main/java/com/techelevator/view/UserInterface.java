package com.techelevator.view;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.techelevator.Account;
import com.techelevator.CateringItem;
import com.techelevator.CateringSystemCLI;
import com.techelevator.Inventory;
import com.techelevator.view.UserInterface;


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
		System.out.println("***************************************************************");
		System.out.println(" JJ's Catering App ");

		System.out.println("**************************************************************\n");

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

		
		System.out.println("\n*********** List of Items Avaliable ******************************\n");
		System.out.printf("%-5s | %-20s | %15s | %-5s | %-5s", "Item ID", "Item Name", "Category", "Quantity", "Price $");
		System.out.println("\n--------------------------------------------------------------------\n");
		
		
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
		System.out.printf("%-6s | %-20s | %15s | %-5s | %-5s",cateringitem.getItemId(), cateringitem.getName(), cateringitem.getFoodType(), cateringitem.getNumOfCateringItems(), "$" + cateringitem.getPrice());

		System.out.println("\n**********************************************************************\n");		
		
	}
	
	public String printPurchasingsubMenu() {

		System.out.println("****************************************************************************");
		System.out.println(" JJ's Catering App Ordering Process ");
		System.out.println("****************************************************************************\n");

		System.out.println("1. Add Money");
		System.out.println("2. Select product");
		System.out.println("3. Complete transaction");
		System.out.println("4. Return to previous menu\n");
		


		System.out.println("Please select your choice (number only)");

		return scanner.nextLine();

	}	
	

	
	
	
	
	

	

				
	
	
	
	
	
	
	
	
	
}
