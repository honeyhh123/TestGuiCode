package com.honeyhh.guitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MySelenium {
    //this is commit by zc
    //update by remote
    public String searchKeys(String keyword) throws InterruptedException {
        //本地修改
        //打开chrome的对象
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);
        //调用chrome打开网页
        driver.navigate().to("http://www.baidu.com");
        //在网页中寻找输入框
        WebElement search_input = driver.findElement(By.name("wd"));
        //输入关键词
        search_input.sendKeys(keyword);
        //提交搜索
        search_input.submit();
        Thread.sleep(3000);
        //看搜索结果是否返回
        if(driver.getTitle().equals(keyword+"_百度搜索"))
            return "成功";
        driver.quit();
        return "失败";
    }



}
