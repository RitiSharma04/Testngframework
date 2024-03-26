package com.natwest.practice.testngframework.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment extends BasePage{
    @FindBy(xpath = "//input[@id=\"paymentmethod_2\"]")
    private WebElement creditCardPay ;
    @FindBy(xpath = "//input[@class=\"button-1 payment-method-next-step-button\"]")
    private WebElement continueButton ;
    @FindBy(xpath = "//input[@id=\"CardholderName\"]")
    private WebElement cardHolderName;
    @FindBy(xpath = "//input[@id=\"CardNumber\"]")
    private WebElement cardNumber;
    @FindBy(xpath = "//input[@id=\"CardCode\"]")
    private WebElement cardCode;
    @FindBy(xpath = "//input[@class=\"button-1 payment-info-next-step-button\"]")
    private WebElement goFurtherButton ;

    public void chooseCreditCardPayment(){
        creditCardPay.click();
    }
    public void clickContinue(){
        continueButton.click();
    }
    public void setCardHolderName(String name){
        cardHolderName.sendKeys(name);
    }
    public void setCardNumber(String number){
        cardNumber.sendKeys(number);
    }
    public void setCardCode(String fourDigitCode){
        cardCode.sendKeys(fourDigitCode);
    }
    public void clickGoFurther(){
        goFurtherButton.click();
    }
}
