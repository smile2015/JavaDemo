/**
 * 
 */
package com.mosorg.sharestools.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		//接收前台数据
		// 处理中文
		String name =new String(request.getParameter("name").trim().getBytes("ISO8859-1"),"UTF-8");
		
		String code = request.getParameter("code").trim();
		
		Float commissionRate = StringHelper.ConvertToFloat(request.getParameter("commissionRate").trim());
		
		Company company=new Company();
		company.setCode(code);
		company.setName(name);
		company.setCommissionRate(commissionRate);
		
		int result=companyService.addCompany(company);
		
		if(result>0){
			message="<div style='color: green;'>添加证券公司成功！</div>";
		}
		
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		String title = "使用 POST 方法读取表单数据";
		
		String docType = "<!DOCTYPE html> \n";
		out.println(docType +
		    "<html>\n" +
		    "<head><title>" + title + "</title></head>\n" +
		    "<body bgcolor=\"#f0f0f0\">\n" +
		    "<h1 align=\"center\">" + title + "</h1>\n" 
		    + message +
		    "</body></html>");
		
		
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#destroy()
	 */
	@Override
	public void destroy() {
	}
	
	

}
