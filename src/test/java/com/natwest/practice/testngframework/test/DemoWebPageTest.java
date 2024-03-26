package com.natwest.practice.testngframework.test;

import com.natwest.practice.testngframework.pom.BuyABook;
import com.natwest.practice.testngframework.pom.LoginPage;
import com.natwest.practice.testngframework.pom.Payment;
import com.natwest.practice.testngframework.pom.ShoppingCart;
import com.natwest.practice.testngframework.utils.DriverUtils;
import org.testng.annotations.Test;

public class DemoWebPageTest {
    @Test(priority = 1)
    public void verifyLogin(){
        LoginPage loginPage = new LoginPage();
        DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");

        loginPage.clickLoginButton();
        loginPage.enterEmail("ankitsingh8@gmail.com");
        loginPage.enterPass("ak@12345");
        loginPage.clickRememberMeButton();
        loginPage.submitLoginCredentials();
    }

    @Test(priority = 2,dependsOnMethods = "verifyLogin")
    public void verifyBuyABook(){

        BuyABook obj = new BuyABook();
        obj.goToBookSection();
        obj.sortBy();
        obj.setSortLowToHighPrice();
        obj.setBookTitleButton();
        obj.setAddToCartButton();

    }
    @Test(priority = 3,dependsOnMethods = "verifyBuyABook")
    public void verifyShoppingCart(){

        ShoppingCart obj = new ShoppingCart();
        obj.clickShoppingCart();
        obj.clickTermsOfService();
        obj.clickCheckOut();
        obj.clickGoToNextStep();
        obj.clickPickUpInStore();
        obj.clickContinue();
    }
    @Test(priority = 4, dependsOnMethods = "verifyShoppingCart")
    public void verifyPayment(){

        Payment obj = new Payment();
        obj.chooseCreditCardPayment();
        obj.clickContinue();
        obj.setCardHolderName("Ankit");
        obj.setCardNumber("5675675679870987");
        obj.setCardCode("1234");
        obj.clickGoFurther();
    }
}
