/**
 * 
 */
package com.mosorg.sharestools.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mosorg.sharestools.vo.Lucre;

/**
 * @author mwb
 *
 *证券公司信息数据库操作接口
 */
public interface ILucreDao {

	public Lucre queryLucreByCode(String code) throws SQLException;
	public ArrayList<?> queryAllByCode(String code) throws SQLException;
	
	
}
