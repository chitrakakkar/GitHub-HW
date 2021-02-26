package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValidISBN() {
		ValidatorISBN validator = new ValidatorISBN();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first ISBN", result);
		
		result = validator.checkISBN("0140177396");
		assertTrue("second ISBN", result);
		
	}
	
	@Test
	public void checkAnInvalidISBN() {
		
		ValidatorISBN validator = new ValidatorISBN();
		boolean result = validator.checkISBN("0140449117");
		assertFalse(result);
		
	}
}
