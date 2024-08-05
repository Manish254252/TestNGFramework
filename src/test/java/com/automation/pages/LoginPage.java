package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement signInInput;


    public void openWebSite() {
        driver.navigate().to("https://www.saucedemo.com/");
    }

    public void doLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInInput.click();
    }

    public boolean isLoginPageDisplayed() {
        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }
}
