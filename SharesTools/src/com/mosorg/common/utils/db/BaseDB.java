/**
 * 
 */
package com.mosorg.common.utils.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author msmiles
 *
 * 数据库操作基类
 *
 */
public interface BaseDB {
	
	public Connection getConnection(String url,String username,String password);
	
	public PreparedStatement getPreparedStatement(String sql);

	public int execute(String sql) throws SQLException;
	
	public ResultSet executeQuery(String sql) throws SQLException;
	
	public void closeConnection(Connection conn);
	
	public void closePreparedStatement(PreparedStatement pstm);
	
	public void closeResultSet(ResultSet rs);
}
