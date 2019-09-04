/**
 * 
 */
package com.mosorg.sharestools.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mosorg.sharestools.dao.ILucreDao;
import com.mosorg.sharestools.dao.impl.LucreDaoImpl;
import com.mosorg.sharestools.service.ILucreService;
import com.mosorg.sharestools.vo.Lucre;
import com.mosorg.common.utils.log.LogHelper;

/**
 * @author mwb
 *
 */
public class LucreServiceImpl implements ILucreService {
	
	ILucreDao lucreDao=new LucreDaoImpl();


	/* (non-Javadoc)
	 * @see com.mosorg.sharestools.service.ILucreService#queryLucre(java.lang.String)
	 */
	public Lucre queryLucreByCode(String code) {
		try {
			return lucreDao.queryLucreByCode(code);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return null;
	}

	//模糊查询
	@SuppressWarnings("unchecked")
	public ArrayList<Lucre> queryAllByCode(String code) {
		try {
			return (ArrayList<Lucre>) lucreDao.queryAllByCode(code);
		} catch (SQLException e) {
			LogHelper.info(e.toString());
			e.printStackTrace();
		}
		return null;
	}

}
