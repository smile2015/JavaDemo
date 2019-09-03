/**
 * 
 */
package com.mosorg.sharestools.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mosorg.common.utils.convert.StringHelper;
import com.mosorg.sharestools.service.ICompanyService;
import com.mosorg.sharestools.service.impl.CompanyServiceImpl;
import com.mosorg.sharestools.vo.Company;

/**
 * @author mwb
 *
 */
public class CompanyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7929482530974532053L;
	
	private String message;
	
	ICompanyService companyService=new CompanyServiceImpl();

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException {
		// 执行必需的初始化
	    message = "操作失败.";

	}
	
	

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		String title = "使用 GET 方法读取表单数据";
		
		//接收前台数据
		// 处理中文
		String name =new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
		String docType = "<!DOCTYPE html> \n";
		out.println(docType +
		    "<html>\n" +
		    "<head><title>" + title + "</title></head>\n" +
		    "<body bgcolor=\"#f0f0f0\">\n" +
		    "<h1 align=\"center\">" + title + "</h1>\n" +
		    "<ul>\n" +
		    "  <li><b>股票代码</b>："
		    + request.getParameter("code") + "</li>" +
		    "  <li><b>证券公司名称</b>："
		    + name+ "</li>" +
		    "  <li><b>证券公司佣金费率</b>："
		    + request.getParameter("commissionRate") + "</li>" +
		    "</ul>\n" +
		    "</body></html>");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		//String url=request.getContextPath();
		//String url=request.getServletPath();
		String[] url = request.getRequestURL().toString().split("/");
		String op=url[url.length-1];
		System.out.println("url: "+url.toString());
		System.out.println("op: "+op);
		
		Company company=new Company();
		
		
		int result=0;
		
		if("add".equals(op)){
			//接收前台数据
			String code = request.getParameter("code").trim();
			company.setCode(code);
			// 处理中文
			String name =new String(request.getParameter("name").trim().getBytes("ISO8859-1"),"UTF-8");
			BigDecimal commissionRate = StringHelper.ConvertToBigDecimal(request.getParameter("commissionRate").trim());
			company.setName(name);
			company.setCommissionRate(commissionRate);
			result=companyService.addCompany(company);
			if(result>0){
				message="<tr><td ><div style='color: green;'>添加证券公司成功！</div></td></tr>";
			}
			}
		else if("delete".equals(op)){
			String code = request.getParameter("code").trim();
			company.setCode(code);
			result=companyService.deleteCompany(code);
			if(result>0){
				message="<tr><td ><div style='color: green;'>删除证券公司成功！</div></td></tr>";
			}
			}
		else if("modify".equals(op)){
			//接收前台数据
			String code = request.getParameter("code").trim();
			company.setCode(code);
			// 处理中文
			String name =new String(request.getParameter("name").trim().getBytes("ISO8859-1"),"UTF-8");
			BigDecimal commissionRate = StringHelper.ConvertToBigDecimal(request.getParameter("commissionRate").trim());
			company.setName(name);
			company.setCommissionRate(commissionRate);
			result=companyService.modifyCompany(company);
			if(result>0){
				message="<tr><td ><div style='color: green;'>修改证券公司成功！</div></td></tr>";
			}
			}
		else if("query".equals(op)){
			String condition=request.getParameter("condition").trim();
			String key = request.getParameter("key").trim();
			if("code".equals(condition)){
				company=companyService.queryCompanyByCode(key);
			}else if("name".equals(condition)){
				company=companyService.queryCompanyByName(key);
			}else if("commissionRate".equals(condition)){
				company=companyService.queryCompanyByRate(key);
			}
			message="<tr><td align='center'>股票代码：</td><td align='center'>公司名称：</td><td align='center'>佣金费率：</td></tr>"+
				    "<tr><td align='center'>"+company.getCode()+"</td><td align='center'>"+company.getName()+"</td><td align='center'>"+company.getCommissionRate()+"</td></tr>";
			}
		
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		String title = "使用 POST 方法读取表单数据";
		
		String docType = "<!DOCTYPE html> \n";
		out.println(docType +
		    "<html>\n" 
			+"<head><title>" + title + "</title></head>\n" 
		    +"<body bgcolor=\"#f0f0f0\">\n" 
			+"<h1 align=\"center\">" + title + "</h1>\n"
			+"<table>"+
			message
		    +"<tr><td ><div style='color: green;'><a href='../index.jsp'>返回首页</a></div></td></tr></table>"
		    + "</body></html>");
		
		
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#destroy()
	 */
	@Override
	public void destroy() {
	}
	
	

}
