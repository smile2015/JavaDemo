/**
 * 
 */
package com.maventest.action;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.maventest.model.Account;
import com.maventest.service.AccountServiceI;


/**
 * @author MyPC
 *
 */
@ParentPackage("basePackage")
@Namespace("/strutsDemo")
@Action(value="accountAction")
public class AccountAction {
	
	private AccountServiceI accountService;
	
	public AccountServiceI getAccountService() {
		return accountService;
	}

	@Autowired
	public void setAccountService(AccountServiceI accountService) {
		this.accountService = accountService;
	}

	private static final Logger logger = Logger.getLogger(AccountAction.class);
	
	
//	private static final ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//	private static final AccountServiceI accountService=(AccountServiceI) ac.getBean("accountService");
	
	
	
	
	public void addAccount(Account account){
		logger.info("Log4j：进入 Account Add Action");
		accountService.addAccount(account);
	}
	
	public void delAccount(){
		logger.info("Log4j：进入 Account Del Action");
		accountService.delAccount();
	}

}
