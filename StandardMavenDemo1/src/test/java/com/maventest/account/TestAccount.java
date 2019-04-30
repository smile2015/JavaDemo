/**
 * 
 */
package com.maventest.account;

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
	
	@Test
	public void test(){
		
		ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
		AccountServiceI userService=(AccountServiceI) ac.getBean("accountService");
		Account account=new Account();
		account.setId(UUID.randomUUID().toString());
		account.setName("七星云-恒");
		account.setPwd("Smile");
		account.setCreatedatetime(new Date());
		userService.addAccount(account);
		
	}

}
