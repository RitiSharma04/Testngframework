package com.natwest.practice.testngframework.pom;

import com.natwest.practice.testngframework.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private WebDriver driver ;

    public BasePage(){
        driver = DriverUtils.getDriver();
        PageFactory.initElements(driver,this);
    }
}
