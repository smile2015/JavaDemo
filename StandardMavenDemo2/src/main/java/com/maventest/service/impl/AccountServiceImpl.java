/**
 * 
 */
package com.maventest.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maventest.dao.AccountDaoI;
import com.maventest.model.Account;
import com.maventest.service.AccountServiceI;

/**
 * @author MyPC
 *
 */
@Service("accountService")
public class AccountServiceImpl implements AccountServiceI {
	
	private AccountDaoI accountDao;
	
	
	public AccountDaoI getAccountDao() {
		return accountDao;
	}

	@Autowired
	public void setAccountDao(AccountDaoI accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(AccountServiceImpl.class);

	@Override
	public void addAccount(Account account) {
		
		logger.info("Log4j：进入 Account Add Service");
		this.accountDao.save(account);

	}

	@Override
	public void delAccount() {
		
		logger.info("Log4j：进入 Account Del Service");
	}

}
