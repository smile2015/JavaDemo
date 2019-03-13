/**
 * 
 */
package com.mosorg.vs.service.restapi;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mosorg.vs.service.restapi.response.BaseResponse;
import com.mosorg.vs.service.restapi.response.UserResponse;
import com.mosorg.vs.vo.User;

/**
 * @author Administrator
 *
 */
@Path("/user")
public class UserService {
	@GET
	@Path("/regUser")
	//@Produces(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public BaseResponse getUserText() {
		User user=new User();
		user.setNickname("smile");
		user.setAge(23);
		user.setEmail("mwb20088@163.com");
		user.setAccount("mwb");
		user.setSex("man");
		user.setUserid("U11002");
		user.setUserhead("/img/users/head/avatar.png");
		user.setRole("0");
		List<User> users=new ArrayList<>();
		users.add(user);
		
		UserResponse resp=new UserResponse();
		resp.setUser(users);
		
		return resp;
	}

	@GET
	@Path("/userLogin")
	//@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public UserResponse UserLogin() {
		User user=new User();
		user.setNickname("smile");
		user.setAge(23);
		user.setEmail("mwb20088@163.com");
		user.setAccount("mwb");
		user.setSex("man");
		user.setUserid("U11002");
		user.setUserhead("/img/users/head/avatar.png");
		user.setRole("0");
		List<User> users=new ArrayList<>();
		users.add(user);
		
		UserResponse resp=new UserResponse();
		resp.setUser(users);
		
		return resp;
	}

	@GET
	@Path("/getUser")
	@Produces(MediaType.APPLICATION_JSON)
	public UserResponse getUserJson() {
		User user=new User();
		user.setNickname("smile");
		user.setAge(23);
		user.setEmail("mwb20088@163.com");
		user.setAccount("mwb");
		user.setSex("man");
		user.setUserid("U11002");
		user.setUserhead("/img/users/head/avatar.png");
		user.setRole("0");
		List<User> users=new ArrayList<>();
		users.add(user);
		
		UserResponse resp=new UserResponse();
		resp.setUser(users);
		
		return resp;
	}
}
