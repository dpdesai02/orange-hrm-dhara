package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.Utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By displayLogo = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By UserProfileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']/i[1]");
    By MouseHover = By.xpath("//a[contains(text(),'Logout')]");
   // By Search = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]");
    By PIM = By.xpath("//a[@class='oxd-main-menu-item active']");
    By Leave = By.xpath("//div[@class='oxd-sidepanel-body']/ul[1]/li[3]/a[1]/span[1]");
    By Dashboard = By.xpath("//div[@class='oxd-sidepanel-body']/ul[1]/li[8]/a[1]");

    public String displayLogoHome() {
        return getTextFromElement(displayLogo);
    }

    public void userProfileLogoClick() {
        clickOnElement(UserProfileLogo);
    }

    public void MouseHoverLogo() throws InterruptedException {
        mouseHoverToElementAndClick(MouseHover);
    }

    public void PIMClick() {
        clickOnElement(PIM);
    }

    public void LeaveClick() {
        clickOnElement(Leave);
    }

    public void ClickDashboard() {
        clickOnElement(Dashboard);
    }

}
