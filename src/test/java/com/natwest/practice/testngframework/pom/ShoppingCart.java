package com.natwest.practice.testngframework.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends BasePage{
    @FindBy(xpath = "(//span[@class=\"cart-label\"])[1]")
    private WebElement shoppingCartButton ;
    @FindBy(xpath = "//input[@id=\"termsofservice\"]")
    private WebElement termsOfServiceButton ;

    @FindBy(xpath = "//button[@id=\"checkout\"]")
    private WebElement checkoutButton ;

    @FindBy(xpath = "//input[@class=\"button-1 new-address-next-step-button\"]")
    private WebElement goToNextStepButton ;

    @FindBy(xpath = "//input[@id=\"PickUpInStore\"]")
    private WebElement pickUpInStoreButton ;
    @FindBy(xpath = "(//input[@class=\"button-1 new-address-next-step-button\"])[2]")
    private WebElement continueButton;

    public void clickShoppingCart(){
        shoppingCartButton.click();
    }

    public void clickTermsOfService(){
        termsOfServiceButton.click();
    }
    public void clickCheckOut(){
        checkoutButton.click();
    }
    public void clickGoToNextStep(){
        goToNextStepButton.click();
    }
    public void clickPickUpInStore(){
        pickUpInStoreButton.click();
    }
    public void clickContinue(){
        continueButton.click();
    }
}
