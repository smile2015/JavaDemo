/**
 * 
 */
package com.mosorg.sharestools.test;

import java.sql.SQLException;

import com.mosorg.sharestools.dao.ICompanyDao;
import com.mosorg.sharestools.dao.impl.CompanyDaoImpl;
import com.mosorg.sharestools.vo.Company;

/**
 * @author mwb
 *
 */
public class TestDao {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		ICompanyDao companyDao=new CompanyDaoImpl();
		Company company =new Company();
		company.setCode("600030");
		company.setName("中信证券");
		company.setCommissionRate((float) 0.0005);
		companyDao.delete(company.getCode());
		System.out.println(companyDao.add(company));
	}

}
