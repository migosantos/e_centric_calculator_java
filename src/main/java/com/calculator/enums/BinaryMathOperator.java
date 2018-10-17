package com.calculator.enums;

/**
 * 
 * @author Juanmiguel.Santos
 *
 */
public enum BinaryMathOperator {
	ADD ("+"),
	SUBTRACT ("-"),
	MULTIPLY ("*"),
	DIVIDE ("/"),
	EXPONENTIAL ("^");
	
	private final String operation;
	
	BinaryMathOperator(String operation) {
		this.operation = operation;
	}

	public String getOperation() {
		return operation;
	}
	
	public static BinaryMathOperator getByOperation(String operation) {
		for(BinaryMathOperator m : BinaryMathOperator.values()) {
			if(m.getOperation().equals(operation)) {
				return m;
			}
		}
		return null;
	}
}
