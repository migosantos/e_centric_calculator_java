package com.calculator.exceptions;

public class InsufficientParametersException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * InsufficientParametersException if there are insufficient parameters for a given operation
	 * 
	 * @param message exception message
	 */
    public InsufficientParametersException(String message) {
        super(message);
    }


}
