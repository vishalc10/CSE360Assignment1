package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * Class Calculator to practice test driven development, using JUnit and GitHub
 * @author Vishal Chilka Pin[215]
 * @version Feb 21, 2016
 * 
 */

/* Class to test the working of Calculator.java */
public class CalculatorTest {

	/* Test method for default Constructor */
	@Test
	public void testCalculator() {
		
		Calculator myCalculator = new Calculator();
		fail("Default fail assert");
		assertNotNull("Object doesn't return a null", myCalculator);
	}

	/* Test method for correct total */
	@Test
	public void testGetTotal() {
		
	}

	/* Test method for addition */
	@Test
	public void testAdd() {
		
	}

	/* Test method for subtraction */
	@Test
	public void testSubtract() {
		
	}

	/* Test method for multiplication */
	@Test
	public void testMultiply() {
		
	}

	/* Test method for division */
	@Test
	public void testDivide() {
		
	}

	/* Test method for getting history of operations */
	@Test
	public void testGetHistory() {
		
	}

}
