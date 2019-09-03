/**
 * 
 */
package com.mosorg.sharestools.service.impl;

import java.sql.SQLException;

import com.mosorg.sharestools.dao.ICompanyDao;
import com.mosorg.sharestools.dao.impl.CompanyDaoImpl;
import com.mosorg.sharestools.service.ICompanyService;
import com.mosorg.sharestools.vo.Company;
import com.mosorg.common.utils.log.LogHelper;

/**
 * @author mwb
 *
 */
public class CompanyService implements ICompanyService {
	
	ICompanyDao companyDao=new CompanyDaoImpl();

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.service.ICompanyService#queryCompany(java.lang.String)
	 */
	public Company queryCompany(String code) {
		try {
			return companyDao.query(code);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.service.ICompanyService#deleteCompany(java.lang.String)
	 */
	public int deleteCompany(String code) {
		try {
			return companyDao.delete(code);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.service.ICompanyService#modifyCompany(java.lang.String)
	 */
	public int modifyCompany(Company company) {
		try {
			return companyDao.modify(company);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.service.ICompanyService#addCompany(com.mosorg.sharestools.vo.Company)
	 */
	public int addCompany(Company company) {
		try {
			return companyDao.add(company);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return 0;
	}

}
