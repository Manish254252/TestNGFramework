package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DescriptionPage extends BasePage {

    @FindBy(id = "checkout")
    WebElement checkOutButton;

    @FindBy(id = "continue-shopping")
    WebElement continueShoppingButton;

    public boolean clickCheckOutButton() {
        return checkOutButton.isDisplayed();
    }

    public void clickContinueShopping() {
        continueShoppingButton.click();
    }
}
