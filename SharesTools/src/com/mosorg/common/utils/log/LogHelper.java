package com.mosorg.common.utils.log;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description 日志记录类
 * @author panteng
 * @version V0.0.1
 * @date 2016-09-08
 */
public class LogHelper {
    //public static Logger log = Logger.getLogger(LogHelper.class);
    public static Log logger = LogFactory.getLog(LogHelper.class);
    
    /**
     * 打印警告
     * 
     * @param obj
     */
    public static void warn(Object obj) {
        try{
            /*** 获取输出信息的代码的位置 ***/
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            /***
            location = stacks[2].getClassName() + "." + stacks[2].getMethodName()
                    + "(" + stacks[2].getLineNumber() + ")";
                    **/
           
            location = getCodeLocation(stacks);
            
            /*** 是否是异常  ***/
            if (obj instanceof Exception) {
                Exception e = (Exception) obj;
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw, true));
                String str = sw.toString();
                logger.warn(location +" - "+ str);
            } else {
            	logger.warn(location +" - "+ obj.toString());
            }
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * 打印信息
     * 
     * @param obj
     */
    public static void info(Object obj) {
        try{
            /*** 获取输出信息的代码的位置 ***/
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            /***
            location = "["+stacks[2].getClassName() + "] [" + stacks[2].getMethodName()
                    + "(" + stacks[2].getLineNumber() + ")]";
                    ***/
            
            location = getCodeLocation(stacks);
            
            /*** 是否是异常  ***/
            if (obj instanceof Exception) {
                Exception e = (Exception) obj;
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw, true));
                String str = sw.toString();
                logger.info(location +" - "+ str);
            } else {
            	logger.info(location +" - "+ obj.toString());
            }
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * 打印错误
     * 
     * @param obj
     */
    public static void error(Object obj) {
        try{
            /*** 获取输出信息的代码的位置 ***/
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            /***
            location = stacks[2].getClassName() + "." + stacks[2].getMethodName()
                    + "(" + stacks[2].getLineNumber() + ")";
                    **/
           
            location = getCodeLocation(stacks);
            
            /*** 是否是异常  ***/
            if (obj instanceof Exception) {
                Exception e = (Exception) obj;
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw, true));
                String str = sw.toString();
                logger.error(location +" - "+ str);
            } else {
            	logger.error(location +" - "+ obj.toString());
            }
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
    /**
     * 向数据库告警表中插入信息
     * @param obj
     */
    public static void dbWarn(Object obj) {
        try{
            String printInfo = "";
            /*** 获取输出信息的代码的位置 ***/
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            /***
            location = stacks[2].getClassName() + "." + stacks[2].getMethodName()
                    + "(" + stacks[2].getLineNumber() + ")";
                    **/
           
            location = getCodeLocation(stacks);
            
            /*** 是否是异常  ***/
            if (obj instanceof Exception) {
                Exception e = (Exception) obj;
                printInfo = location +" - "+ e.getMessage();
                logger.fatal(printInfo.substring(0, printInfo.length() > 512?512:printInfo.length()));
            } else {
                printInfo = location +" - "+ obj.toString();
                logger.fatal(printInfo.substring(0, printInfo.length() > 512?512:printInfo.length()));
            }
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
    /**
     * 获取调用此函数的代码的位置
     * @return 包名.类名.方法名(行数)
     */
    public static String getCodeLocation(StackTraceElement[] stacks){
    	try{
            /*** 获取输出信息的代码的位置 ***/
            String location = "";
            location = "["+stacks[2].getFileName() + "(" + stacks[2].getLineNumber() + ")] [" + stacks[2].getMethodName()+"]";
            return location;
        }catch (Exception e) {
            // TODO: handle exception
            LogHelper.error(e);
            return "";
        }
    }
    
    
    /**
     * 获取调用此函数的代码的位置
     * @return 包名.类名.方法名(行数)
     */
    public static String getCodeLocation(){
        try{
            /*** 获取输出信息的代码的位置 ***/
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            location = "["+stacks[2].getClassName() + "] [" + stacks[2].getMethodName()
                    + "(" + stacks[2].getLineNumber() + ")]";
            return location;
        }catch (Exception e) {
            // TODO: handle exception
            LogHelper.error(e);
            return "";
        }
    }
}