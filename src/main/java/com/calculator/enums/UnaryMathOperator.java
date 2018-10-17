package com.calculator.enums;

/**
 * 
 * @author Juanmiguel.Santos
 *
 */
public enum UnaryMathOperator {
	SQRT ("sqrt");
	
	private final String operation;
	
	UnaryMathOperator(String operation) {
		this.operation = operation;
	}

	public String getOperation() {
		return operation;
	}
	
	public static UnaryMathOperator getByOperation(String operation) {
		for(UnaryMathOperator m : UnaryMathOperator.values()) {
			if(m.getOperation().equalsIgnoreCase(operation)) {
				return m;
			}
		}
		return null;
	}
}
