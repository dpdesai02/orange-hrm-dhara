package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    DashboardPage dashboardPage = new DashboardPage();
    AdminPage adminPage = new AdminPage();

    @Test
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
    }

    @Test
    public void verifyThatTheLogoDisplayOnHomePage() {
        homePage.displayLogoHome();
    }

    @Test
    public void verifyUserShouldLogOutSuccessFully() throws InterruptedException {
        loginPage.LoginToApplication("Admin", "admin123");
        homePage.userProfileLogoClick();
        homePage.MouseHoverLogo();
        loginPage.getVerifyLogin();
    }
}
