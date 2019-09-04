/**
 * 
 */
package com.mosorg.common.utils.convert;

import java.math.BigDecimal;

/**
 * @author mwb
 *
 */
public class StringHelper {
	
	public static BigDecimal ConvertToBigDecimal(String value) {
		return new BigDecimal(value);
	}
	

}
