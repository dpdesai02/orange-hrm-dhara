package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.Utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By VerifyLogin = By.xpath("//h5[normalize-space()='Login']");
    By usernameField = By.xpath("//input[@name='username']");
    By passwordField = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button[@type='submit']");

    public String getVerifyLogin() {
        return getTextFromElement(VerifyLogin);
    }

    public void enterUsername(String email) {
        sendTextToElement(usernameField, email);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void LoginToApplication(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickOnLoginButton();
    }

}
