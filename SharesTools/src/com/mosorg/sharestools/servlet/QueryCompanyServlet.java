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
public class QueryCompanyServlet extends HttpServlet {

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
		String condition=request.getParameter("condition").trim();
		String key = request.getParameter("key").trim();
		
		
		if("code".equals(condition)){
			company=companyService.queryCompanyByCode(key);
			//转向导JSP并传递数据
			request.setAttribute("company",company); 
			request.getRequestDispatcher("showCompany.jsp").forward(request, response);
		}else if("name".equals(condition)){
			company=companyService.queryCompanyByName(key);
			//转向导JSP并传递数据
			request.setAttribute("company",company); 
			request.getRequestDispatcher("showCompany.jsp").forward(request, response);
		}else if("commissionRate".equals(condition)){
			company=companyService.queryCompanyByRate(key);
			//转向导JSP并传递数据
			request.setAttribute("company",company); 
			request.getRequestDispatcher("showCompany.jsp").forward(request, response);
		}else if("all".equals(condition)){
			ArrayList companys=companyService.queryAllByCode(key);
			//转向导JSP并传递数据
			request.setAttribute("companys",companys); 
			request.getRequestDispatcher("listCompany.jsp").forward(request, response);
			
		}
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#destroy()
	 */
	@Override
	public void destroy() {
	}
	
	

}
