/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Brower
 * Author:   MyPC
 * Date:     2019/4/26 17:07
 * Description: 浏览器实例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mosorg.autotest.demo.java;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈浏览器实例〉
 *
 * @author MyPC
 * @create 2019/4/26
 * @since 1.0.0
 */
public class Brower {
    WebDriver driver;

    public WebDriver chrome() {
        String webDriverPath =  "C:\\Users\\MyPC\\IdeaProjects\\SeleniumTestNGDemo\\libs\\webdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",webDriverPath);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // 启动时自动最大化窗口
        options.addArguments("--disable-popup-blocking"); // 禁用阻止弹出窗口
        options.addArguments("no-sandbox"); // 启动无沙盒模式运行
        options.addArguments("disable-extensions"); // 禁用扩展
        options.addArguments("no-default-browser-check"); // 默认浏览器检查
        Map<String, Object> prefs = new HashMap();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);// 禁用保存密码提示框

        driver = new ChromeDriver(options);
        //设置寻找一个元素的时间
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;

    }

}
