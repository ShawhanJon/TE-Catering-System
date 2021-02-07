
package com.techelevator;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Account {
	public double balance;



	public double getBalance() {
		return balance;
	}

	public void addMoney(double moneyToAdd) {
		Set<Double> values = new HashSet<Double>(Arrays.asList(new Double[] {1.00, 5.00, 10.00, 20.00, 50.00, 100.00}));
			if(values.contains(moneyToAdd)) {
				balance += moneyToAdd;
				System.out.print("Your current balance is: $");
				System.out.printf("%.2f", balance);
				System.out.println(".");
			} else {
				System.out.println("Invalid Currency Amount, Only $1s, $5s, $10s, $20s, $50s, and $100s\n ");
			} 
	}
		
		public void getChange(double balanceAfterPurchase) {
			Double[] change = new Double[] {0.25, 0.10, 0.05};
			  String[] typeOfCoin = new String[] {"Quarter(s)", "Dime(s)", "Nickle(s)"};
			  for(int i = 0; i < change.length; i++) {
			    	  int count;
			    	  count = (int) (balanceAfterPurchase / change[i]);

			      balanceAfterPurchase -= (change[i] * count);
			      System.out.println(count + " " + typeOfCoin[i]);
			  }
		}
		

}

