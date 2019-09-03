/**
 * 
 */
package com.mosorg.sharestools.vo;

import java.math.BigDecimal;

/**
 * @author mwb
 *证券公司信息实体类
 */
public class Company {
	
	private String code;
	private String name;
	private BigDecimal commissionRate;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(BigDecimal bigDecimal) {
		this.commissionRate = bigDecimal;
	}
	
	

	

}
