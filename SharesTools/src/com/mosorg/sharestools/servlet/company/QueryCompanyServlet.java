/**
 * 
 */
package com.mosorg.sharestools.servlet.company;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mosorg.sharestools.servlet.BaseServlet;

/**
 * @author mwb
 *
 */
public class QueryCompanyServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7929482530974532053L;
	

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		companyMgt.queryCompany(request,response);
		
	}

	
	

}
