package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;


public class InventoryLoader {
	
	 /**This method returns a Map after loading inventory from catering system.csv file.*/
	public Map <String, CateringItem>loadInventoryFromFile() throws FileNotFoundException{
	 	Map<String, CateringItem>cateringItemMap = new HashMap<String, CateringItem>();
	 
	 	try(Scanner scanner = new Scanner(new File("cateringsystem.csv"))){
	 		while(scanner.hasNextLine()) {
	 			String line = scanner.nextLine();
	 			String[] splitedValues = line.split(Pattern.quote("|"));
	 			if(splitedValues [3].equalsIgnoreCase("B")){
	 				CateringItem cateringItem = new Beverage(splitedValues[0], splitedValues[1],Double.valueOf(splitedValues[2]), splitedValues[3]);
					cateringItemMap.put(splitedValues[0], cateringItem);	
				}
	 			else if(splitedValues [3].equalsIgnoreCase("A")){
	 				CateringItem cateringItem = new Appetizer(splitedValues[0], splitedValues[1],Double.valueOf(splitedValues[2]), splitedValues[3]);
					cateringItemMap.put(splitedValues[0], cateringItem);	
				}
	 			else if(splitedValues [3].equalsIgnoreCase("D")){
	 				CateringItem cateringItem = new Dessert(splitedValues[0], splitedValues[1],Double.valueOf(splitedValues[2]), splitedValues[3]);
					cateringItemMap.put(splitedValues[0], cateringItem);	
				}
	 			else if(splitedValues [3].equalsIgnoreCase("E")){
	 				CateringItem cateringItem = new Entree(splitedValues[0], splitedValues[1],Double.valueOf(splitedValues[2]), splitedValues[3]);
					cateringItemMap.put(splitedValues[0], cateringItem);	
				}
	 					
	 		}
	 		
	 		
	 		return cateringItemMap;
	 		
	 	}
	 	
	 
	 	
	} 
	
	 
	
	
}
