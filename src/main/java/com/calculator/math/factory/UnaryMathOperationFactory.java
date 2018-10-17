package com.calculator.math.factory;

import java.math.BigDecimal;

import com.calculator.enums.UnaryMathOperator;
import com.calculator.math.interfaces.UnaryMathOperation;

/**
 * 
 * @author Juanmiguel.Santos
 *
 */
public class UnaryMathOperationFactory {

	/**
	 * Factory for unary operations
	 * 
	 * @param strOperation type of operation
	 * @return UnaryMathOperation
	 */
	public static UnaryMathOperation getMathOperation(String strOperation) {
		UnaryMathOperator mathOperator = UnaryMathOperator.getByOperation(strOperation);
		UnaryMathOperation operation = null;
		
		switch(mathOperator) {
			case SQRT:  
				operation = (num1) -> new BigDecimal(Math.sqrt(num1.doubleValue()));
				break;
			default:				
		}
		return operation;
	}
}
