package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest {


    @Test
    public void verifyUserCanLoginWithValidCredentials(){
        loginPage.openWebSite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));

        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home Page Not Displayed");
    }

    @Test
    public void verifyUserLogOut() {
        loginPage.openWebSite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home Page is Not Displayed");

        homePage.clickOnBurgerMenu();
        homePage.clickOnLogoutLink();
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "Login page is not loaded properly");

    }
}
