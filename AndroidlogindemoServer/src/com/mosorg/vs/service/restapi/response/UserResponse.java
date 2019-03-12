/**
 * 
 */
package com.mosorg.vs.service.restapi.response;

import java.util.ArrayList;
import java.util.List;

import com.mosorg.vs.vo.User;

/**
 * @author Administrator
 *
 */
public class UserResponse extends BaseResponse {
	
	List<User> users =new ArrayList<>();

	public List<User> getUsers() {
		return users;
	}

	public void setUser(List<User> users) {
		this.users = users;
	}
	
	

}
