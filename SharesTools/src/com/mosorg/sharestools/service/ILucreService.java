/**
 * 
 */
package com.mosorg.sharestools.service;

import java.util.ArrayList;

import com.mosorg.sharestools.vo.Lucre;

/**
 * @author mwb
 *
 */
public interface ILucreService {
	
	public Lucre queryLucreByCode(String code);
	public ArrayList<?> queryAllByCode(String code);

}
