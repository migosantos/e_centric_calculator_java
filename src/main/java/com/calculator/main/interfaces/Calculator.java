package com.calculator.main.interfaces;

import java.math.BigDecimal;

public interface Calculator {
	BigDecimal doOperation(String operation, BigDecimal num1, BigDecimal num2);
}
