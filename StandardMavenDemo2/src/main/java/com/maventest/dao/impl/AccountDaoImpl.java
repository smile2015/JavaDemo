/**
 * 
 */
package com.maventest.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maventest.dao.AccountDaoI;
import com.maventest.model.Account;

/**
 * @author MyPC
 *
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDaoI {
	
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public Serializable save(Account account) {
		return this.sessionFactory.getCurrentSession().save(account);
	}

}
