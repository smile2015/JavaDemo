package com.mosorg.common.utils.db.template;

import java.util.List;

/**
 * @author msmiles
 * 
 * JDBC操作数据库模板类
 *
 */
public abstract class MosorgJdbcTemplate<T> {
	
	int result=0;

	public int save(T t){
		return result;
	}
	
	public int update(T t){
		return result;
	}
	
	public int delte(T t){
		return result;
	}
	
	public T query(Integer id){
		return null;
	}
	
	public List<T> queryAll(){
		return null;
	}
	
}
