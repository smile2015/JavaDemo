/**
 * 
 */
package com.mosorg.sharestools.servlet.lucre;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mosorg.sharestools.service.ILucreService;
import com.mosorg.sharestools.service.impl.LucreServiceImpl;
import com.mosorg.sharestools.vo.Lucre;

/**
 * @author mwb
 *
 */
public class LucreMgt {
	
	
	ILucreService lucreService=new LucreServiceImpl();
	
	public void queryLucre(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		Lucre lucre=new Lucre();
		String condition=request.getParameter("condition").trim();
		String key = request.getParameter("key").trim();
		
		
		if("sharesCode".equals(condition)){
			lucre=lucreService.queryLucreByCode(key);
			//转向导JSP并传递数据
			request.setAttribute("lucre",lucre); 
			request.getRequestDispatcher("showLucre.jsp").forward(request, response);
		}else if("all".equals(condition)){
			ArrayList<?> lucres=lucreService.queryAllByCode(key);
			//转向导JSP并传递数据
			request.setAttribute("lucres",lucres); 
			request.getRequestDispatcher("listLucre.jsp").forward(request, response);
			
		}
	}

	public void showLucre(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		Lucre lucre=new Lucre();
		String code = request.getParameter("code").trim();
		lucre=lucreService.queryLucreByCode(code);
		String message = "加载证券公司成功！";
		//转向导JSP并传递数据
		request.setAttribute("lucre",lucre); 
		request.setAttribute("message",message); 
		request.getRequestDispatcher("showLucre.jsp").forward(request, response);
	}

}
