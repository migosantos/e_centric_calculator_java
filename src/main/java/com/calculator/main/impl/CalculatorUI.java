package com.calculator.main.impl;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.calculator.constants.CalculatorConstants;
import com.calculator.formatter.NumberFormatter;
import com.calculator.main.interfaces.Calculator;

public class CalculatorUI {
	
	public static void main(String[] args) {
		CalculatorUI ui = new CalculatorUI();
		String input = ui.askForInput();
		input = input.replace(" ", "");
		
		Calculator calc = new CalculatorImpl();
		System.out.println("Parsing input...");
		BigDecimal num1=ui.getNum1(input);
		BigDecimal num2=ui.getNum2(input);
		String operation=ui.getOperation(input);
		BigDecimal result = calc.doOperation(operation, num1, num2);
		System.out.println();
		System.out.println(new StringBuilder()
				.append("Result: ")
				.append(NumberFormatter.formatNumber(result)));
	}

	public String askForInput() {
		String result = null;
		
		System.out.println("Please input Operand Operation Operand (eg. 5+22):");
		Scanner sc = new Scanner(System.in);
		result = sc.nextLine();
		return result;
	}
	
	public BigDecimal getNum1(String input) {
		BigDecimal result = null;
		Pattern p = Pattern.compile(CalculatorConstants.NUMBER_PATTERN);
	    Matcher m = p.matcher(input);
	    if (m.find()) {
	        result = new BigDecimal(m.group(1));
	    }

	    System.out.println("num1: " + NumberFormatter.formatNumber(result));
	    return result;
	}
	
	public BigDecimal getNum2(String input) {
		BigDecimal result = null;
		Pattern p = Pattern.compile(CalculatorConstants.NUMBER_PATTERN);
	    Matcher m = p.matcher(input);
	    m.find();
	    if (m.find()) {
	        result = new BigDecimal(m.group(1));
	    }

	    System.out.println("num2: " + NumberFormatter.formatNumber(result));
	    return result;
	}
	
	public String getOperation(String input) {
	    String result = input.replaceAll(CalculatorConstants.NUMBER_PATTERN, "").replace(" ", "");
	    System.out.println("operation: " + result);
	    return result;
	}

}
