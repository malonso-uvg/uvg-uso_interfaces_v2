/**
 * 
 */
package com.uvg.ejemplo1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.uvg.ejemplo1.Calc;

/**
 * @author MAAG
 *
 */
class CalcTest {

	/**
	 * Test method for {@link com.uvg.ejemplo1.Calc#saveValue(int)}.
	 */
	@Test
	void testSaveValue() {
		Calc myCalc = new Calc();
		myCalc.saveValue(20);
		assertEquals(20, myCalc.getValue());
	}

	/**
	 * Test method for {@link com.uvg.ejemplo1.Calc#getValue()}.
	 */
	@Test
	void testGetValue() {
		Calc myCalc = new Calc();
		myCalc.saveValue(20);
		assertEquals(20, myCalc.getValue());
	}

	/**
	 * Test method for {@link com.uvg.ejemplo1.Calc#addition(int, int)}.
	 */
	@Test
	void testAddition() {
		Calc myCalc = new Calc();
		assertEquals(8, myCalc.addition(5, 3));
	}

	/**
	 * Test method for {@link com.uvg.ejemplo1.Calc#substraction(int, int)}.
	 */
	@Test
	void testSubstraction() {
		Calc myCalc = new Calc();
		assertEquals(2, myCalc.substraction(5, 3));
	}

	/**
	 * Test method for {@link com.uvg.ejemplo1.Calc#multiplication(int, int)}.
	 */
	@Test
	void testMultiplication() {
		Calc myCalc = new Calc();
		assertEquals(6, myCalc.multiplication(3, 2));
	}
	
	/**
	 * Test method for {@link com.uvg.ejemplo1.Calc#multiplication(int, int)}.
	 */
	@Test
	void testMultiplicationComutativa() {
		Calc myCalc = new Calc();
		assertEquals(6, myCalc.multiplication(2, 3));
	}
	
	/**
	 * Test method for {@link com.uvg.ejemplo1.Calc#multiplication(int, int)}.
	 */
	@Test
	void testMultiplicationZero() {
		Calc myCalc = new Calc();
		assertEquals(0, myCalc.multiplication(0, 3));
	}

	/**
	 * Test method for {@link com.uvg.ejemplo1.Calc#div(int, int)}.
	 */
	@Test
	void testDiv() {
		Calc myCalc = new Calc();
		assertEquals(5, myCalc.div(10, 2));
	}

	/**
	 * Test method for {@link com.uvg.ejemplo1.Calc#mod(int, int)}.
	 */
	@Test
	void testMod() {
		Calc myCalc = new Calc();
		assertEquals(1, myCalc.mod(11, 2));
	}

}
