/**
 * 
 */
package com.mosorg.common.utils.db.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mosorg.common.utils.db.DBUtils;
import com.mosorg.common.utils.file.PropertiesUtil;
import com.mosorg.common.utils.log.LogHelper;



/**
 * @author msmiles
 *
 */
public class MySQLUtils extends DBUtils {
	private static String URL = "jdbc:mysql://127.0.0.1:3306/finance?useUnicode=true&characterEncoding=utf-8";
	private static String USER = "root";
	private static String PASSWORD = "MINGtian2010";
	private static String DRIVER="com.mysql.jdbc.Driver";

	static {
			
			URL = PropertiesUtil.getValue("jdbc.url");
			DRIVER = PropertiesUtil.getValue("jdbc.className");
			USER = PropertiesUtil.getValue("jdbc.username");
			PASSWORD = PropertiesUtil.getValue("jdbc.password");
			
			try {
				Class.forName(DRIVER);
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@Override
	public Connection getConnection(String url,String username,String password) {

		try {

			if (null == conn) {

				conn = DriverManager.getConnection(url, username, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public PreparedStatement getPreparedStatement(String sql) {

		try {

			if (null == pstm) {

				pstm = conn.prepareStatement(sql);
			}
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return pstm;
	}

	@Override
	public int execute(String sql) throws SQLException {
		int result=0;
		pstm = conn.prepareStatement(sql);

		result = pstm.executeUpdate(sql);

		return result;
	}

	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		pstm = conn.prepareStatement(sql);
		rs = pstm.executeQuery();

		return rs;
	}

}
