package com.techelevator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Inventory {
	
	// This HashMap contains our inventory of cateringItems. We must protect it so it is private.
	// Only way to modify data is to go through the public methods below.
	private Map<String, CateringItem> cateringInventory;
	

				/**
				 * This constructor is called when the program loads (see CateringSystemCLI class). When inventory class is created
				 * it will load 'sample data.
				 * @throws FileNotFoundException 
				 */
				public Inventory() throws FileNotFoundException {
				InventoryLoader loader = new InventoryLoader();
			    cateringInventory = loader.loadInventoryFromFile();
			    
				}
				
				/**This method returns a list of all the catering items.*/
				public List<CateringItem> retrieveListOfCateringItems(){
					List<CateringItem>cateringItemList = new ArrayList<CateringItem>();
					Set<String> keys = cateringInventory.keySet();
					
					for (String key : keys) {
						
						cateringItemList.add(cateringInventory.get(key));
						
					}
					
					
					return cateringItemList;
				
					
					
				}
				
				public Map <String, CateringItem>getInventoryMap(){
					Map<String, CateringItem>inventoryMap = new HashMap<String, CateringItem>();
					inventoryMap.putAll(cateringInventory);
					return inventoryMap;
					
				}
				
		
		
	
		
			    

}
