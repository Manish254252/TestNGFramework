package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTest extends BaseTest {

    @Test
    public void sortByPriceHighToLow() {
        loginPage.openWebSite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        homePage.sortBy(ConfigReader.getConfigValue("PriceHighToLow"));
        Assert.assertEquals(homePage.getFirstPrice(), ConfigReader.getConfigValue("HighestPrice"));
    }

    @Test
    public void sortByPriceLowToHigh() {
        loginPage.openWebSite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        homePage.sortBy(ConfigReader.getConfigValue("PriceLowToHigh"));
        Assert.assertEquals(homePage.getFirstPrice(), ConfigReader.getConfigValue("LowestPrice"));
    }

    @Test
    public void sortByNameZtoA() {
        loginPage.openWebSite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        homePage.sortBy(ConfigReader.getConfigValue("NameZtoA"));
        Assert.assertEquals(homePage.getFirstInventoryItemName(), "Test.allTheThings() T-Shirt (Red)");
    }
}
