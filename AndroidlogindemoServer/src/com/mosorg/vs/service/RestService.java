package com.mosorg.vs.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.mosorg.vs.vo.User;

@Path("/api/app/")
public class RestService {
	@GET
	@Path("/getUserText")
	@Produces(MediaType.TEXT_PLAIN)
	public String getUserText() {
		return "Hello,World!";
	}

	@GET
	@Path("/getUserXml")
	@Produces(MediaType.APPLICATION_XML)
	public User getUserXml() {
		User user = new User();
		user.setAccount("snail");
		user.setAge(22);
		user.setSex("male");
		return user;
	}

	@GET
	@Path("/getUserJson")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserJson() {
		User user = new User();
		user.setAccount("snail");
		user.setAge(22);
		user.setSex("male");
		return user;
	}
}
