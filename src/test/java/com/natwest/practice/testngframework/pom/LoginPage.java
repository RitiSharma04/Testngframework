package com.natwest.practice.testngframework.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//a[@class = \"ico-login\"]")
    private WebElement loginButton;

    @FindBy(name = "Email")
    private WebElement email;

    @FindBy(name = "Password")
    private WebElement password;

    @FindBy(xpath = "//label[@for= \"RememberMe\"]")
    private WebElement rememberMeButton;

    @FindBy(xpath = "//input[@class = \"button-1 login-button\"]")
    private WebElement submitLoginCredentialsButton ;

    public void clickLoginButton(){
        loginButton.click();
    }
    public void enterEmail(String input){
        email.sendKeys(input);
    }
    public void enterPass(String input){
        password.sendKeys(input);
    }
    public void clickRememberMeButton(){
        rememberMeButton.click();
    }
    public void submitLoginCredentials(){
        submitLoginCredentialsButton.click();
    }

}
