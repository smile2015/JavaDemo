/**
 * 
 */
package com.maventest.action;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.maventest.service.UserServiceI;


/**
 * @author MyPC
 *
 */
@ParentPackage("basePackage")
@Namespace("/strutsDemo")
@Action(value="userAction")
public class UserAction {
	
	private UserServiceI userService;
	
	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	private static final Logger logger = Logger.getLogger(UserAction.class);
	
	
//	private static final ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//	private static final UserServiceI userService=(UserServiceI) ac.getBean("userService");
	
	
	
	
	public void addUser(){
		logger.info("Log4j：进入 User Add Action");
		userService.addUser();
	}
	
	public void delUser(){
		logger.info("Log4j：进入 User Del Action");
		userService.delUser();
	}

}
