package com.mosorg.vs.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author itlanbao
 * IT蓝豹
 * 解析获取用户基本信息
 */
@XmlRootElement
public class User  implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	 {"ret":"0","errcode":"0","msg":"接口调用成功","nickname":"erom","userhead":"/img/users/head/avatar.png",
//	"userid":"11653","email":"123456789@qq.com","role":"0"}
	private String userid;//用户id
	private String nickname;//昵称
	private String userhead;//用户头像路径 
	private String email;//用户邮件
	
	private String name;

	private Integer age;

	private String sex;
	
	private String role;//角色 是不是管理员
	
	
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUserhead() {
		return userhead;
	}
	public void setUserhead(String userhead) {
		this.userhead = userhead;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
 

}
