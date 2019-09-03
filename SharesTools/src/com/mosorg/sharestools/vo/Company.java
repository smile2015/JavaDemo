/**
 * 
 */
package com.mosorg.sharestools.vo;

/**
 * @author mwb
 *证券公司信息实体类
 */
public class Company {
	
	private String code;
	private String name;
	private Float commissionRate;
	
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
	public Float getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(Float commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	

	

}
