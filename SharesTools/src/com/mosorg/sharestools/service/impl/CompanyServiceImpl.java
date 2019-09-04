/**
 * 
 */
package com.mosorg.sharestools.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mosorg.sharestools.dao.ICompanyDao;
import com.mosorg.sharestools.dao.impl.CompanyDaoImpl;
import com.mosorg.sharestools.service.ICompanyService;
import com.mosorg.sharestools.vo.Company;
import com.mosorg.common.utils.log.LogHelper;

/**
 * @author mwb
 *
 */
public class CompanyServiceImpl implements ICompanyService {
	
	ICompanyDao companyDao=new CompanyDaoImpl();


	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.service.ICompanyService#deleteCompany(java.lang.String)
	 */
	public int deleteCompany(String code) {
		try {
			return companyDao.deleteCompany(code);
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
			return companyDao.modifyCompany(company);
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
			return companyDao.addCompany(company);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return 0;
	}

	public Company queryCompanyByName(String name) {
		try {
			return companyDao.queryCompanyByName(name);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return null;
	}

	public Company queryCompanyByRate(String rate) {
		try {
			return companyDao.queryCompanyByRate(rate);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.service.ICompanyService#queryCompany(java.lang.String)
	 */
	public Company queryCompanyByCode(String code) {
		try {
			return companyDao.queryCompanyByCode(code);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return null;
	}

	//模糊查询
	@SuppressWarnings("unchecked")
	public ArrayList<Company> queryAllByCode(String code) {
		try {
			return (ArrayList<Company>) companyDao.queryAllByCode(code);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return null;
	}

}
