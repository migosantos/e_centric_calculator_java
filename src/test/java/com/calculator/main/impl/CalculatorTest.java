package com.calculator.main.impl;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.calculator.main.interfaces.Calculator;

public class CalculatorTest {

	private Calculator calc;
	private CalculatorUI ui;
	@Before
	public void setUp() throws Exception {
		ui = new CalculatorUI();
		calc = new CalculatorImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddition() {
		String input="5+10";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("15"));
	}
	
	@Test
	public void testAdditionWithDecimals() {
		String input="5.1+10.2";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("15.3"));
	}

	@Test
	public void testSubtraction() {
		String input="88-22";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("66"));
	}

	@Test
	public void testSubtractionWithDecimals() {
		String input="55.25-22.20";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("33.05"));
	}
	
	@Test
	public void testMultiplication() {
		String input="25*4";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("100"));
	}
	
	@Test
	public void testMultiplicationWithDecimals() {
		String input="25.5*3";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("76.5"));
	}
	
	@Test
	public void testDivision() {
		String input="6/3";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("2"));
	}
	
	@Test
	public void testDivisionWithDecimals() {
		String input="9.9/3.3";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("3"));
	}

	@Test
	public void testExponential() {
		String input="10^3";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("1000"));
	}

	@Test
	public void testSquareRoot() {
		String input="9sqrt";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("3"));
	}
	
	@Ignore("Sine is for next sprint")
	@Test
	public void testSin() {
		String input="90sin";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("1"));
	}

	@Ignore("Cosine is for next sprint")
	@Test
	public void testCos() {
		String input="90cos";
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println("result: " + result);
		System.out.println();
		assertEquals(result,new BigDecimal("0"));
	}
}
