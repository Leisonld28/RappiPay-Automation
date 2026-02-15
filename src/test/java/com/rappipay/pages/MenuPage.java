package com.rappipay.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MenuPage extends BasePage {

    private By menuButton   = By.xpath("//android.view.ViewGroup[@content-desc='open menu']");
    private By logoutButton = By.xpath("//android.view.ViewGroup[@content-desc='logout']");

    public MenuPage(AndroidDriver driver) {
        super(driver);
    }

    public void logout() {
        click(menuButton);
        click(logoutButton);
    }
}
