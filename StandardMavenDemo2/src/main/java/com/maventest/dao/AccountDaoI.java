/**
 * 
 */
package com.maventest.dao;

import java.io.Serializable;

import com.maventest.model.Account;

/**
 * @author MyPC
 *
 */
public interface AccountDaoI {
	
	public Serializable save(Account account);

}
