/**
 * 
 */
package com.maventest.service.impl;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Service;

import com.maventest.service.UserServiceI;

/**
 * @author MyPC
 *
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	/* (non-Javadoc)
	 * @see com.maventest.service.UserServiceI#addUser()
	 */
	@Override
	public void addUser() {
		
		logger.info("Log4j：进入 User Add Service");

	}

	@Override
	public void delUser() {
		
		logger.info("Log4j：进入 User Del Service");
	}

}
