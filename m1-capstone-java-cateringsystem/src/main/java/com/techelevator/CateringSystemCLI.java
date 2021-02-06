package com.techelevator;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.techelevator.CateringItem;
import com.techelevator.CateringSystemCLI;
import com.techelevator.Inventory;
import com.techelevator.view.UserInterface;

public class CateringSystemCLI {
	
	private UserInterface UI;
	private static final String Display_Catering_Items = "1";
	private static final String Order = "2";
	private static final String Quit = "3";

	

	
	/**This is the constructor.*/
	public CateringSystemCLI(UserInterface ui) {
		this.UI = ui;
	}
	
	
	 
	
	 Account account = new Account();
	 Cart cart = new Cart ();
	
	 Map<String, CateringItem> cateringInventory;
	
	 Scanner scanner = new Scanner(System.in);
	 
	 
	 
	 
	 


	
	
	
	/**The main() should just create an instance of the class, and delegate to the run method
	 * @throws FileNotFoundException */
	public static void main(String[] args) throws FileNotFoundException {
		UserInterface menu = new UserInterface();
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
	
	}	

	
	
	public void run() throws FileNotFoundException {
		Inventory inventory = new Inventory();
		
	
		
		/**This is a boolean value to keep the program running unless user enters exit.*/
    	boolean isRunning = true;
    	
        while (isRunning) {
        	
        	/**This method calls the menu class to print menu and get response.*/
        	String userChoice = UI.printMainMenu();  
        	if(userChoice.equals(Display_Catering_Items )) {
        		/**Call the inventory class and get list of Catering items.*/
        		List<CateringItem>cateringItems = inventory.retrieveListOfCateringItems();
        		
        		//Send list to catering items to print.
    			UI.printListOfCateringItems(cateringItems);
    			
        		
        	}
        	else if(userChoice.equals(Order )) {
        		/**Calls the subMenu.*/
        		subMenu();	
        		
        		
        	}
        	
        	else if(userChoice.equals(Quit )) {
        		/**Close the program.*/
        		isRunning = false;
        		System.out.println("Exiting program....");	
        		System.exit(0);	
        		
        	}
        
		
			else {
				System.out.println("Please select a valid option!");
			}    		
	
        }
        
	} 
	
	 private void subMenu() throws FileNotFoundException {
		
			boolean Looping = true;
			
	    	while (Looping) {
	    				
	    		String subMenuOption = UI.printPurchasingsubMenu();
	    				
	    		if (subMenuOption.equalsIgnoreCase("1")) {
	    				System.out.println("You chose add money, please enter the amount you will like to add.");	
	    				Double credit = Double.parseDouble(scanner.nextLine());
	    				account.addMoney(credit);
	    				
	    		}
	    		else if (subMenuOption.equalsIgnoreCase("2")) {
		    		Inventory inventory = new Inventory();
		   			cateringInventory = inventory.getInventoryMap();
		   			System.out.println("please enter the item's product code you will like to purchase.");
		   			String userInput = scanner.nextLine();
		   			
		   			//System.out.println("Hey there! " + cateringInventory);
		   			if(cateringInventory.containsKey(userInput.toUpperCase())) {
						//System.out.println("cateringInventory contains the Product code.");
			
							if(cateringInventory.get(userInput).itemAvailable() && (account.getBalance() >= cateringInventory.get(userInput).getPrice())) {
								cateringInventory.get(userInput).purchaseItem();
								cart.addToCart(cateringInventory.get(userInput));
								Double userBalance = account.getBalance() - cateringInventory.get(userInput).getPrice(); 
								System.out.println("Here is your Balance $" + userBalance);
								
							}	
					}
		   			 else {	
		   			 	
		   				 System.out.println("The product code you entered is not avaliable, please try again.");
		   			 }		
	    		  
	    		}
	    		else if (subMenuOption.equalsIgnoreCase("3")){
	    			System.out.println("Complete transaction");	
	    			
	    		}
	    		else {
	    			System.out.println("Returning to main menu.");	
	    			Looping = false;
	    		}
	    				
	    } 
	    	
        	
          
		
	       
	} 
	 
	 
}


	
	
	
	      
        
	
	




