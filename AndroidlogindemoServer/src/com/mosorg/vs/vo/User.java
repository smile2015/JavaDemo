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
	//用户id
		private String userid;
		//昵称
		private String nickname;
		//用户头像路径 
		private String userhead;
		//用户邮件
		private String email;
		
		//账号
		private String account;
		
		//手机号
		private String phone;
		
		//密码
		private String password;

		private Integer age;

		private String sex;
		
		//角色 是不是管理员
		private String role;
	
	
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
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
 
}
