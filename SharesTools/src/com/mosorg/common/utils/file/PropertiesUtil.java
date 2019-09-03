package com.mosorg.common.utils.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author msmiles
 *
 */
public class PropertiesUtil {
	
	// 使用Properties类来加载属性文件
    static Properties props = new Properties();
    private static String filePath="config/web.properties";
    
    static{
    	System.out.println("filePath: "+filePath);
    	//InputStream ins=ClassLoader.getSystemResourceAsStream(filePath);
    	InputStream ins=PropertiesUtil.class.getClassLoader().getResourceAsStream(filePath);
    	try {
			props.load(ins);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	
	public static void loadProperties(String fpath){
		if(null!=fpath && !"".equals(fpath)){
			filePath=fpath;
		}
		try {
			 InputStream ins=ClassLoader.getSystemResourceAsStream(filePath);
			props.load(ins);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * 
	 * @param key
	 * @return
	 */
	public static String getValue(String key){
		return props.getProperty(key);
	}
	

}