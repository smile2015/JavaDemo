/**
 * 
 */
package com.maventest.user;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maventest.service.UserServiceI;

/**
 * @author MyPC
 *
 */
public class TestUser {
	
	@Test
	public void test(){
		
		ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
		UserServiceI userService=(UserServiceI) ac.getBean("userService");
		userService.addUser();
		
	}

}
