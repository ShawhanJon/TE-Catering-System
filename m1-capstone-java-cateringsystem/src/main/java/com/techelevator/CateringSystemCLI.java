package com.techelevator;

import java.io.FileNotFoundException;
import java.util.List;

import com.techelevator.CateringItem;
import com.techelevator.CateringSystemCLI;
import com.techelevator.Inventory;
import com.techelevator.view.UserInterface;

public class CateringSystemCLI {
	
	private UserInterface UI;
	private static final String Display_Catering_Items = "1";
	private static final String Order = "2";
	private static final String Quit = "3";

	//private UserInterface ui;

	
	/**This is the constructor.*/
	public CateringSystemCLI(UserInterface ui) {
		this.UI = ui;
	}
	
	
	
	/**The main() should just create an instance of the class, and delegate to the run method
	 * @throws FileNotFoundException */
	public static void main(String[] args) throws FileNotFoundException {
		UserInterface menu = new UserInterface();
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
		
		
		//UserInterface menu = new UserInterface();
		//CateringSystemCLI cli = new CateringSystemCLI(menu);
		//cli.run();
	}	

	
	
	public void run() throws FileNotFoundException {
		
		Inventory inventory = new Inventory();
		
		/**This is a boolean value to keep the program running unless user enters exit.*/
    	boolean IsRunning = true;
    	
        while (IsRunning) {
        	
        	/**This method calls the menu class to print menu and get response.*/
        	String userChoice = UI.printMainMenu();  
        	if(userChoice.equals(Display_Catering_Items )) {
        		/**Call the inventory class and get list of Catering items.*/
        		List<CateringItem>cateringItems = inventory.retrieveListOfCateringItems();
        		//send list to menu class to print
    			UI.printListOfCateringItems(cateringItems);
    			
        		
        	}
        	
        }   
		
	       
	}  
}	
	
	
	//choice
	//variable
	//If else statement

//new inventory

// print main menu

//print sub menu

// Get cart items

// Check Item Availability

// update purchase log

	      
        
	
	




