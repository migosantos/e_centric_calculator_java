package com.calculator.formatter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 
 * @author Juanmiguel.Santos
 *
 */
public class NumberFormatter {
	
	/**
	 * Formats the number according to the specification
	 * 
	 * @param d the number to be formatted
	 * @return Formatted Number
	 */
	public static String formatNumber(BigDecimal d) {
		if(d==null) {
			return "";
		}
		
		DecimalFormat df = new DecimalFormat("##.##########");
		df.setRoundingMode(RoundingMode.DOWN);
		return df.format(d);
	}

}
