package com.rappipay.tests;

import com.rappipay.pages.LoginPage;
import com.rappipay.pages.HomePage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginLogoutFlow() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        // Login con credenciales válidas
        loginPage.login("standard_user", "secret_sauce");

        // Logout
        homePage.logout();
    }
}

