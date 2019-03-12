/**
 * 
 */
package com.mosorg.vs.service.restapi.response;

/**
 * @author Administrator
 *
 */
public class BaseResponse {
	
	private String ret="0";//请求状态码
	private String errcode="0";//错误码
	private String msg="succes";
	
	public String getRet() {
		return ret;
	}
	public void setRet(String ret) {
		this.ret = ret;
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
