package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValidISBN() {
		ValidatorISBN validator = new ValidatorISBN();
		boolean result = validator.checkISBN(140449116);
		assertTrue(result);
		
	}
}
