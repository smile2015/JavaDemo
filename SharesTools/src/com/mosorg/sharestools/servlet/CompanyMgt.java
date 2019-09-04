/**
 * 
 */
package com.mosorg.sharestools.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

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
	
	public int addCompany(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
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
			message="添加证券公司成功！";
			//转向导JSP并传递数据
			request.setAttribute("message",message);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else{
			message="添加证券公司失败！";
			//转向导JSP并传递数据
			request.setAttribute("message",message); 
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		return result;
	}

}
