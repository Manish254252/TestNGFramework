package com.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenuIcon;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOutLink;

    @FindBy(css = ".product_sort_container")
    WebElement filterOption;

    @FindBy(id = "shopping_cart_container")
    WebElement cartIcon;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeButton;

    @FindBy(className = "product_sort_container")
    WebElement sortButton;

    @FindBy(className = "inventory_item_price")
    WebElement firstPrice;

    @FindBy(className = "inventory_item_name")
    WebElement firstItemName;


    public void clickOnBurgerMenu() {
        burgerMenuIcon.click();
    }

    public void clickOnLogoutLink() {
        logOutLink.click();
    }

    public boolean isHomePageDisplayed() {

        return filterOption.isDisplayed() && cartIcon.isDisplayed();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public boolean removeButton() {
        return removeButton.isDisplayed();
    }

    public void cartIconClick() {
        cartIcon.click();
    }

    public String cartIconCount() {
        return cartIcon.getText();
    }

    public void sortBy(String value) {
        Select dropDown = new Select(sortButton);
        dropDown.selectByValue(value);
    }

    public String getFirstPrice() {
        return firstPrice.getText();
    }

    public String getFirstInventoryItemName() {
        return firstItemName.getText();
    }
}
