/**
 * 
 */
package com.mosorg.sharestools.servlet.company;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.servlet.ServletException;
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
public class CompanyMgt {
	
	private String message;
	
	ICompanyService companyService=new CompanyServiceImpl();
	
	public void addCompany(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		Company company=new Company();
		int result=0;
		
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
			message="添加证券公司成功！>><a href='company/addCompany.jsp'>继续添加证券公司</a>";
			//转向导JSP并传递数据
			request.setAttribute("message",message);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else{
			message="添加证券公司失败！";
			//转向导JSP并传递数据
			request.setAttribute("message",message); 
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

	public void delCompany(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
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

	public void loadCompany(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		Company company=new Company();
		
		//接收前台数据
		String code = request.getParameter("code").trim();
		company=companyService.queryCompanyByCode(code);
		message="加载证券公司成功！";
		//转向导JSP并传递数据
		request.setAttribute("company",company); 
		request.setAttribute("message",message); 
		request.getRequestDispatcher("modifyCompany.jsp").forward(request, response);
	}
	
	public void showCompany(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		Company company=new Company();
		
		//接收前台数据
		String code = request.getParameter("code").trim();
		company=companyService.queryCompanyByCode(code);
		message="加载证券公司成功！";
		//转向导JSP并传递数据
		request.setAttribute("company",company); 
		request.setAttribute("message",message); 
		request.getRequestDispatcher("showCompany.jsp").forward(request, response);
	}

	public void modifyComapy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		Company company=new Company();
		int result=0;
		
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
			message="修改证券公司成功！";
			//转向导JSP并传递数据
			request.setAttribute("message",message); 
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else{
			message="修改证券公司失败！";
			//转向导JSP并传递数据
			request.setAttribute("message",message); 
					request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

	public void queryCompany(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		Company company=new Company();
		String condition=request.getParameter("condition").trim();
		String key = request.getParameter("key").trim();
		
		
		if("code".equals(condition)){
			company=companyService.queryCompanyByCode(key);
			System.out.println( "company====="+company);
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
			ArrayList<?> companys=companyService.queryAllByCode(key);
			//转向导JSP并传递数据
			request.setAttribute("companys",companys); 
			request.getRequestDispatcher("listCompany.jsp").forward(request, response);
			
		}
	}
}
