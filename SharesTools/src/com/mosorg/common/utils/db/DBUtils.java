/**
 * 
 */
package com.mosorg.common.utils.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mosorg.common.utils.log.LogHelper;

/**
 * @author msmiles
 *
 *         数据库操作基类抽象类
 *
 */
public abstract class DBUtils implements BaseDB {
	
	protected static Connection conn = null;
	protected static PreparedStatement pstm = null;
	protected static ResultSet rs = null;
	
	/***
	 * 
	 */
	public Connection getConnection(String url,String username,String password) {
		return conn;
	}

	/***
	 * 
	 */
	public PreparedStatement getPreparedStatement(String sql) {
		return pstm;
	}

	/**
	 * @throws SQLException *
	 * 
	 */
	public int execute(String sql) throws SQLException {
		return 0;
	}

	/**
	 * @throws SQLException *
	 * 
	 */
	public ResultSet executeQuery(String sql) throws SQLException{
		return rs;
	}

	/***
	 * 
	 */
	public void closeConnection(Connection conn){
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				LogHelper.info(e.toString());
				e.printStackTrace();
			}
		}
	}
	
	/***
	 * 
	 */
	public void closePreparedStatement(PreparedStatement pstm){
		if (null != pstm) {
			try {
				pstm.close();
			} catch (SQLException e) {
				LogHelper.info(e.toString());
				e.printStackTrace();
				
			}
		}
	}

	/***
	 * 
	 */
	public void closeResultSet(ResultSet rs){
		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
