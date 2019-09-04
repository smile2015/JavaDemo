/**
 * 
 */
package com.mosorg.sharestools.service;

import java.util.ArrayList;

import com.mosorg.sharestools.vo.Company;

/**
 * @author mwb
 *
 */
public interface ICompanyService {
	
	public int deleteCompany(String code);
	public int modifyCompany(Company company);
	public int addCompany(Company company);
	public Company queryCompanyByCode(String code);
	public Company queryCompanyByName(String name);
	public Company queryCompanyByRate(String rate);
	public ArrayList queryAllByCode(String code);

}
