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
		assertNotNull("Object doesn't return a null", myCalculator);
	}

	/* Test method for correct total */
	@Test
	public void testGetTotal() {
		fail("Not Yet Implemented");
	}

	/* Test method for addition */
	@Test
	public void testAdd() {
		fail("Not Yet Implemented");
	}

	/* Test method for subtraction */
	@Test
	public void testSubtract() {
		fail("Not Yet Implemented");
	}

	/* Test method for multiplication */
	@Test
	public void testMultiply() {
		fail("Not Yet Implemented");
	}

	/* Test method for division */
	@Test
	public void testDivide() {
		fail("Not Yet Implemented");
	}

	/* Test method for getting history of operations */
	@Test
	public void testGetHistory() {
		fail("Not Yet Implemented");
	}

}
