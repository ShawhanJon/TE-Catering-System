package com.techelevator;


import org.junit.Test;

import com.techelevator.Account;

import org.junit.Assert;

public class AccountTest {
	
	Account accountTest = new Account();
	
	
	@Test
	public void test_getting_user_balance() {
		Assert.assertEquals("User balance is:", 0, accountTest.balance , 0);
	}
	
	
}