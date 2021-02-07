package com.techelevator;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.InventoryLoader;



public class InventoryLoaderTest {
	
	private InventoryLoader loader;

	@Before
	public void before() {
	loader = new InventoryLoader();
	}
	
	@Test
	public void test_if_file_exists() {
		
		File cateringFile =new File("cateringsystem.csv");
		boolean whereIsTheFile = cateringFile.exists();
		Assert.assertTrue("Does file exist:", whereIsTheFile);
	
	}

}
