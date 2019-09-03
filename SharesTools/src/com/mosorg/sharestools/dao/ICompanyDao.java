/**
 * 
 */
package com.mosorg.sharestools.dao;

import java.sql.SQLException;

import com.mosorg.sharestools.vo.Company;

/**
 * @author mwb
 *
 *证券公司信息数据库操作接口
 */
public interface ICompanyDao {

	public Company query(String code) throws SQLException;
	public int delete(String code) throws SQLException;
	public int modify(Company company) throws SQLException;
	public int add(Company company) throws SQLException;
	
	
}
