/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestDemo
 * Author:   MyPC
 * Date:     2019/4/26 17:11
 * Description: 打开网址，定位页面元素并操作
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mosorg.autotest.demo.test;

import com.mosorg.autotest.demo.java.Brower;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 * 〈一句话功能简述〉<br> 
 * 〈打开网址，定位页面元素并操作〉
 *https://www.cnblogs.com/hanxiaomin/p/6180949.html
 * http://chromedriver.storage.googleapis.com/index.html
 * https://blog.csdn.net/php_lina/article/details/85262365
 * 
 * @author MyPC
 * @create 2019/4/26
 * @since 1.0.0
 */
public class TestDemo {
    WebDriver driver;

    @BeforeTest
    public void init() {
        String url = "http://www.baidu.com";

        //新建一个浏览器句柄
        driver = new Brower().chrome();
        //打开URL
        driver.get(url);
    }

    @Test
    @Parameters("searchWord")
    public void search(String searchWord) throws InterruptedException {
        //输入搜索字符串
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys(searchWord);
        //点击[百度一下]按钮
        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

}
