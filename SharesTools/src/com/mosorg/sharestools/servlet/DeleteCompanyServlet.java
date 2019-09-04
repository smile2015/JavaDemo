/**
 * 
 */
package com.mosorg.sharestools.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
public class DeleteCompanyServlet extends HttpServlet {

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
		this.doPost(request, response);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		Company company=new Company();
		int result=0;
		
		//接收前台数据
		String code = request.getParameter("code").trim();
		company.setCode(code);
		result=companyService.deleteCompany(code);
		if(result>0){
			message="删除证券公司成功！";
			//转向导JSP并传递数据
			request.setAttribute("message",message); 
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else{
			message="删除证券公司失败！";
			//转向导JSP并传递数据
			request.setAttribute("message",message); 
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#destroy()
	 */
	@Override
	public void destroy() {
	}
	
	

}
