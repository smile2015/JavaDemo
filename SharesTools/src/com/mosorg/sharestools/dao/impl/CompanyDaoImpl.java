/**
 * 
 */
package com.mosorg.sharestools.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	 * @see com.mosorg.sharestools.dao.ICompanyDao#delete(java.lang.Integer)
	 */
	public int deleteCompany(String code) throws SQLException {
		String sql="DELETE FROM companys WHERE code='"+code.trim()+"'";
		int result=dbUtils.execute(sql);
		System.out.println(result);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.dao.ICompanyDao#modify(java.lang.Integer)
	 */
	public int modifyCompany(Company company) throws SQLException {
		String sql="UPDATE companys SET name='"+company.getName()+"',code='"+company.getCode()+"',commissionRate='"+company.getCommissionRate()+"' WHERE code='"+company.getCode()+"'";
		int result=dbUtils.execute(sql);
		System.out.println(result);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.dao.ICompanyDao#add(com.mosorg.sharestools.vo.Company)
	 */
	public int addCompany(Company company) throws SQLException {
		System.out.println("company.getCommissionRate(): "+company.getCommissionRate());
		//System.out.println("company.getCommissionRate()"+);
		String sql="INSERT INTO companys VALUES('"+company.getCode()+"','"+company.getName()+"','"+company.getCommissionRate()+"')";
		int result=dbUtils.execute(sql);
		System.out.println(result);
		return result;
	}

	public Company queryCompanyByRate(String rate) throws SQLException {
		String sql="SELECT * FROM companys where commissionRate='"+rate+"'";
		Company company=null;
		rs=dbUtils.executeQuery(sql);
		while(rs.next()){
			company=new Company();
			company.setCode(rs.getString("code"));
			company.setName(rs.getString("name"));
			company.setCommissionRate(rs.getBigDecimal("commissionRate"));
		}
		return company;
	}

	public Company queryCompanyByName(String name) throws SQLException {
		String sql="SELECT * FROM companys where name='"+name+"'";
		Company company=null;
		rs=dbUtils.executeQuery(sql);
		while(rs.next()){
			company=new Company();
			company.setCode(rs.getString("code"));
			company.setName(rs.getString("name"));
			company.setCommissionRate(rs.getBigDecimal("commissionRate"));
		}
		return company;
	}

	public Company queryCompanyByCode(String code) throws SQLException {
		String sql="SELECT * FROM companys where code='"+code+"'";
		Company company=null;
		rs=dbUtils.executeQuery(sql);
		while(rs.next()){
			company=new Company();
			company.setCode(rs.getString("code"));
			company.setName(rs.getString("name"));
			company.setCommissionRate(rs.getBigDecimal("commissionRate"));
		}
		return company;
	}

	//模糊查询
	public ArrayList<Company> queryAllByCode(String code) throws SQLException {
		String sql="SELECT * FROM companys where code like '%"+code+"%'";
		if("".equals(code)||null==code){
			sql="SELECT * FROM lucres where companys";
		}
		ArrayList<Company> companys=new ArrayList<Company>();
		
		rs=dbUtils.executeQuery(sql);
		while(rs.next()){
			Company company=new Company();
			company.setCode(rs.getString("code"));
			company.setName(rs.getString("name"));
			company.setCommissionRate(rs.getBigDecimal("commissionRate"));
			companys.add(company);
		}
		return companys;
	}
	

}
