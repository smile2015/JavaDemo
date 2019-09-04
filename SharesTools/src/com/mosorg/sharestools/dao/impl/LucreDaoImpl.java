/**
 * 
 */
package com.mosorg.sharestools.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mosorg.common.utils.db.DBUtils;
import com.mosorg.common.utils.db.impl.MySQLUtils;
import com.mosorg.sharestools.dao.ILucreDao;
import com.mosorg.sharestools.vo.Lucre;

/**
 * @author mwb
 *
 */
public class LucreDaoImpl implements ILucreDao {
	
	DBUtils dbUtils=new MySQLUtils();
	ResultSet rs=null;

	




	public Lucre queryLucreByCode(String sharesCode) throws SQLException {
		String sql="SELECT * FROM lucres where sharesCode='"+sharesCode+"'";
		Lucre lucre=null;
		rs=dbUtils.executeQuery(sql);
		while(rs.next()){
			lucre=new Lucre();
			lucre.setSharesCode(rs.getString("sharesCode"));
			lucre.setCostMoney(rs.getBigDecimal("costMoney"));
			lucre.setIncomeMoney(rs.getBigDecimal("incomeMoney"));
			lucre.setLestMoney(rs.getBigDecimal("lestMoney"));
		}
		return lucre;
	}

	//模糊查询
	public ArrayList<Lucre> queryAllByCode(String sharesCode) throws SQLException {
		String sql="SELECT * FROM lucres where sharesCode like '%"+sharesCode+"%'";
		if("".equals(sharesCode)||null==sharesCode){
			sql="SELECT * FROM lucres where sharesCode";
		}
		
		ArrayList<Lucre> lucres=new ArrayList<Lucre>();
		
		rs=dbUtils.executeQuery(sql);
		while(rs.next()){
			Lucre lucre=new Lucre();
			lucre.setSharesCode(rs.getString("sharesCode"));
			lucre.setCostMoney(rs.getBigDecimal("costMoney"));
			lucre.setIncomeMoney(rs.getBigDecimal("incomeMoney"));
			lucre.setLestMoney(rs.getBigDecimal("lestMoney"));
			lucres.add(lucre);
		}
		return lucres;
	}
	

}
