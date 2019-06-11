/**
 * 
 */
package com.maventest.account;

import org.apache.log4j.Logger;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maventest.model.Account;
import com.maventest.service.AccountServiceI;

/**
 * @author MyPC
 *
 */
public class TestAccount {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestAccount.class);
	
	
	@Test
	public void test(){
		
		ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
		AccountServiceI userService=(AccountServiceI) ac.getBean("accountService");
		Account account=new Account();
		account.setId(UUID.randomUUID().toString());
		account.setName("七星云-恒312");
		account.setPwd("Smil112243");
		logger.info("=============================fdsafds==============");
		logger.info(account);
		
		account.setCreatedatetime(new Date());
		userService.addAccount(account);
		
	}

}
