/**
 * 
 */
package com.mosorg.sharestools.vo;

import java.math.BigDecimal;

/**
 * @author mwb
 *
 */
public class Lucre {
	
	private String sharesCode;
	private BigDecimal costMoney;
	private BigDecimal incomeMoney;
	private BigDecimal lestMoney;
	/**
	 * @return the sharesCode
	 */
	public String getSharesCode() {
		return sharesCode;
	}
	/**
	 * @param sharesCode the sharesCode to set
	 */
	public void setSharesCode(String sharesCode) {
		this.sharesCode = sharesCode;
	}
	/**
	 * @return the costMoney
	 */
	public BigDecimal getCostMoney() {
		return costMoney;
	}
	/**
	 * @param costMoney the costMoney to set
	 */
	public void setCostMoney(BigDecimal costMoney) {
		this.costMoney = costMoney;
	}
	/**
	 * @return the incomeMoney
	 */
	public BigDecimal getIncomeMoney() {
		return incomeMoney;
	}
	/**
	 * @param incomeMoney the incomeMoney to set
	 */
	public void setIncomeMoney(BigDecimal incomeMoney) {
		this.incomeMoney = incomeMoney;
	}
	/**
	 * @return the lestMoney
	 */
	public BigDecimal getLestMoney() {
		return lestMoney;
	}
	/**
	 * @param lestMoney the lestMoney to set
	 */
	public void setLestMoney(BigDecimal lestMoney) {
		this.lestMoney = lestMoney;
	}


	
}
