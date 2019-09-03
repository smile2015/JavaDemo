/**
 * 
 */
package com.mosorg.sharestools.service;

import com.mosorg.sharestools.vo.Company;

/**
 * @author mwb
 *
 */
public interface ICompanyService {
	
	public Company queryCompany(String code);
	public int deleteCompany(String code);
	public int modifyCompany(Company company);
	public int addCompany(Company company);

}
