package com.techelevator;


import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
	 NewPurchaseLog newPurchaseLog = new NewPurchaseLog();
	 
	 
	 
	 
	 


	
	
	
	/**The main() should just create an instance of the class, and delegate to the run method
	 * @throws IOException */
	public static void main(String[] args) throws IOException {
		UserInterface menu = new UserInterface();
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
		
		
	
	}	

	
	
	public void run() throws IOException {
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
        		System.out.println("Have A Great Day!");	
        		System.exit(0);	
        		
        	}
        
		
			else {
				System.out.println("Please select a valid option!");
			}    		
	
        }
        
	} 
	
	 private void subMenu() throws IOException {
			Inventory inventory = new Inventory();
		
			boolean Looping = true;
			
	    	while (Looping) {
	    				
	    		String subMenuOption = UI.printPurchasingsubMenu();
	    				
	    		if (subMenuOption.equalsIgnoreCase("1")) {
	    				System.out.println("You chose add money, please enter the amount you will like to add.");	
	    				double credit = Double.parseDouble(scanner.nextLine());
	    				account.addMoney(credit);
	    				newPurchaseLog.logUser("Add Money", account.getBalance());
	    				
	    				
	    		}
	    		else if (subMenuOption.equalsIgnoreCase("2")) {
	    			List<CateringItem>cateringItems = inventory.retrieveListOfCateringItems();
	    			UI.printListOfCateringItems(cateringItems);
		   			cateringInventory = inventory.getInventoryMap();
		   			System.out.println("Enter the item's product code(e.g: A1) you want to purchase.");
		   			String userInput = scanner.nextLine();
		   			String finaluserInput = userInput.toUpperCase();
		   			
		   			//System.out.println("Hey there! " + cateringInventory);
		   			if(cateringInventory.containsKey(finaluserInput)) {
						//System.out.println("cateringInventory contains the Product code.");
			
							if(cateringInventory.get(finaluserInput).itemAvailable() && (account.getBalance() >= cateringInventory.get(finaluserInput).getPrice())) {
								cateringInventory.get(finaluserInput).purchaseItem(1);
								cart.addToCart(cateringInventory.get(finaluserInput));
								double userBalance = account.getBalance() - cateringInventory.get(finaluserInput).getPrice(); 
								newPurchaseLog.logUser(cateringInventory.get(finaluserInput).getName(), userBalance);
								System.out.println("Here is your change: $");
								account.getChange(userBalance);
								System.out.println( "Here is your balance: $" + (String.format("%.2f", userBalance)));
								
								
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


	
	
	
	      
        
	
	




