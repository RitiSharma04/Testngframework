package com.natwest.practice.testngframework.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyABook extends BasePage{
    @FindBy(xpath = "//a[@href = \"/books\"]")
    private WebElement clickBooks ;

    @FindBy(xpath = "//select[@id=\"products-orderby\"]")
    private WebElement sortByButton ;

    @FindBy(xpath = "//option[@value=\"https://demowebshop.tricentis.com/books?orderby=10\"]")
    private WebElement sortLowToHighPrice ;

    @FindBy(xpath = "//h2[@class=\"product-title\"]")
    private WebElement bookTitleButton ;

    @FindBy(xpath = "//input[@id='add-to-cart-button-13']")
    private WebElement addToCartButton ;

    public void goToBookSection(){
        clickBooks.click();
    }
    public void sortBy(){
        sortByButton.click();
    }
    public void setSortLowToHighPrice(){
        sortLowToHighPrice.click();
    }
    public void setBookTitleButton(){
        bookTitleButton.click();
    }
    public void setAddToCartButton(){
        addToCartButton.click();
    }
}
