/**
 * 
 */
package com.mosorg.sharestools.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mosorg.sharestools.vo.Company;

/**
 * @author mwb
 *
 *证券公司信息数据库操作接口
 */
public interface ICompanyDao {

	public Company queryCompanyByCode(String code) throws SQLException;
	public Company queryCompanyByRate(String rate) throws SQLException;
	public Company queryCompanyByName(String name) throws SQLException;
	public int addCompany(Company company) throws SQLException;
	public int modifyCompany(Company company) throws SQLException;
	public int deleteCompany(String code) throws SQLException;
	public ArrayList<?> queryAllByCode(String code) throws SQLException;
	
	
}
