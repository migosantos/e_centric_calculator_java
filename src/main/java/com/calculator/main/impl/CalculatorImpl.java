package com.calculator.main.impl;

import java.math.BigDecimal;

import com.calculator.main.interfaces.Calculator;
import com.calculator.math.factory.BinaryMathOperationFactory;
import com.calculator.math.factory.UnaryMathOperationFactory;
import com.calculator.math.interfaces.BinaryMathOperation;
import com.calculator.math.interfaces.UnaryMathOperation;

public class CalculatorImpl implements Calculator {
	@Override
	public BigDecimal doOperation(String strOperation, BigDecimal num1, BigDecimal num2) {
		BigDecimal result = null;
		if(num1 != null && num2 != null) {
			BinaryMathOperation binaryOperation = BinaryMathOperationFactory.getMathOperation(strOperation);
			result = binaryOperation.doOperation(num1, num2);
		} else if(num1 != null && num2 == null) {
			UnaryMathOperation unaryOperation = UnaryMathOperationFactory.getMathOperation(strOperation);
			result = unaryOperation.doOperation(num1);
		}
		return result;
	}	
}
