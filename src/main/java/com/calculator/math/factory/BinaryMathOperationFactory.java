package com.calculator.math.factory;

import com.calculator.enums.BinaryMathOperator;
import com.calculator.math.interfaces.BinaryMathOperation;

/**
 * 
 * @author Juanmiguel.Santos
 *
 */
public class BinaryMathOperationFactory {

	/**
	 * Factory for binary operations
	 * 
	 * @param strOperation type of binary operation
	 * @return BinaryMathOperation
	 */
	public static BinaryMathOperation getMathOperation(String strOperation) {
		BinaryMathOperator mathOperator = BinaryMathOperator.getByOperation(strOperation);
		BinaryMathOperation operation = null;
		
		switch(mathOperator) {
			case ADD:  
				operation = (num1,num2) -> num1.add(num2);
				break;
			case SUBTRACT: 
				operation = (num1,num2) -> num1.subtract(num2);			
				break;
			case MULTIPLY:
				operation = (num1,num2) -> num1.multiply(num2);
				break;
			case DIVIDE:
				operation = (num1,num2) -> num1.divide(num2);
				break;
			case EXPONENTIAL:
				operation = (num1,num2) -> num1.pow(num2.intValue());
				break;
			default:				
		}
		return operation;
	}
}
