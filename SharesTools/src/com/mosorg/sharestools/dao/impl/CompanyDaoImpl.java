/**
 * 
 */
package com.mosorg.sharestools.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mosorg.common.utils.db.DBUtils;
import com.mosorg.common.utils.db.impl.MySQLUtils;
import com.mosorg.sharestools.dao.ICompanyDao;
import com.mosorg.sharestools.vo.Company;

/**
 * @author mwb
 *
 */
public class CompanyDaoImpl implements ICompanyDao {
	
	DBUtils dbUtils=new MySQLUtils();
	ResultSet rs=null;

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.dao.ICompanyDao#query(java.lang.Integer)
	 */
	public Company query(String code) throws SQLException {
		String sql="SELECT * FROM companys where code='"+code+"'";
		Company company=new Company();
		rs=dbUtils.executeQuery(sql);
		while(rs.next()){
			company.setCode(rs.getString("code"));
			company.setName(rs.getString("name"));
		}
		return company;
	}

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.dao.ICompanyDao#delete(java.lang.Integer)
	 */
	public int delete(String code) throws SQLException {
		String sql="DELETE FROM companys WHERE code='"+code.trim()+"'";
		int result=dbUtils.execute(sql);
		System.out.println(result);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.dao.ICompanyDao#modify(java.lang.Integer)
	 */
	public int modify(Company company) throws SQLException {
		String sql="UPDATE companys SET name='"+company.getName()+"',code='"+company.getCode()+"',commissionRate='"+company.getCommissionRate()+"' WHERE code='"+company.getCode()+"'";
		int result=dbUtils.execute(sql);
		System.out.println(result);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.dao.ICompanyDao#add(com.mosorg.sharestools.vo.Company)
	 */
	public int add(Company company) throws SQLException {
		String sql="INSERT INTO companys VALUES('"+company.getCode()+"','"+company.getName()+"','"+company.getCommissionRate()+"')";
		int result=dbUtils.execute(sql);
		System.out.println(result);
		return result;
	}

}
