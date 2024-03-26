package com.natwest.practice.testngframework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// this class can be used in any selenium project to set property and driver creation,so we call it generic or utils class .
public class DriverUtils {
    private static WebDriver driver ;
    public static void createDriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RBS\\IdeaProjects\\testngframework\\src\\test\\java\\com\\natwest\\practice\\testngframework\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver()
    {
        if(driver==null){
            createDriver();
        }
        return driver ;
    }
}
