
package com.techelevator;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Account {
	private double balance;

	public Account() {
		
		// addMoney()      calculate balance
		
		// getChange()     calculate change
		
		// calculateBalance() starting balance minus item price	
	}

	public double getBalance() {
		return balance;
	}

	public void addMoney(double moneyToAdd) {
		Set<Double> values = new HashSet<Double>(Arrays.asList(new Double[] {1.00, 5.00, 10.00, 20.00}));
			if(values.contains(moneyToAdd)) {
				balance += moneyToAdd;
				System.out.println("Your current balance is $" + balance + " .");
			} else {
				System.out.println("Invalid Currency Amount, Only $1s, $2s, $5s, and $10s\n ");
			} 
	}
		
		public void getChange() {
			Double[] change = new Double[] {0.25, 0.10, 0.05};
			  String[] typeOfCoin = new String[] {"Quarter(s)", "Dime(s)", "Nickle(s)"};
			  for(int i = 0; i < change.length; i++) {
			    	  int count;
			    	  count = (int) (balance / change[i]);

			      balance -= (change[i] * count);
			      System.out.println(count + " " + typeOfCoin[i]);
			  }
		}
		

}

