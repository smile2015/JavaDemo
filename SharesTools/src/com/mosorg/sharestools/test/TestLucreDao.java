/**
 * 
 */
package com.mosorg.sharestools.test;

import java.sql.SQLException;

import com.mosorg.common.utils.convert.StringHelper;
import com.mosorg.sharestools.dao.ILucreDao;
import com.mosorg.sharestools.dao.impl.LucreDaoImpl;
import com.mosorg.sharestools.vo.Lucre;

/**
 * @author mwb
 *
 */
public class TestLucreDao {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		ILucreDao companyDao=new LucreDaoImpl();
		Lucre lucre=new Lucre();
		lucre.setSharesCode("60030");
		lucre.setCostMoney(StringHelper.ConvertToBigDecimal("562.01"));
		lucre.setIncomeMoney(StringHelper.ConvertToBigDecimal("6662.01"));
		lucre.setLestMoney(StringHelper.ConvertToBigDecimal("5772.01"));
	}

}
