package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.Utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By AdminClick = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    By VerifySystemUserText = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
    By AddButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By VerifyAddUser = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
    By SelectAdminDrop = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By SelectAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By EnterEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By EnterEmployeeName1 = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Goutam  Ganesh')]");
    By EnterUsername = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input[1]");
    By SelectStatus = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By SelectDisable = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By EnterPassword = By.xpath("//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By EnterConfirmPassword = By.xpath("//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By ClickOnSave = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public void clickAdminLink() {
        clickOnElement(AdminClick);
    }

    public String getSystemUserText() {
        return getTextFromElement(VerifySystemUserText);
    }

    public void clickAddButton() {
        clickOnElement(AddButton);
    }

    public String AddUser() {
        return getTextFromElement(VerifyAddUser);
    }

    public void selectAdminRole() throws InterruptedException {
        clickOnElement(SelectAdminDrop);
        Thread.sleep(2000);
        clickOnElement(SelectAdmin);
        Thread.sleep(2000);
    }

    public void enterEmployeeName() throws InterruptedException {
        sendTextToElement(EnterEmployeeName, "DD");
        Thread.sleep(2000);
        clickOnElement(EnterEmployeeName1);
    }

    public void EnterUserName() {
        sendTextToElement(EnterUsername, "DD Patel");
    }

    public void selectDisableOption() throws InterruptedException {
        clickOnElement(SelectStatus);
        Thread.sleep(2000);
        clickOnElement(SelectDisable);
        Thread.sleep(2000);
    }

    public void enterPassword() {
        sendTextToElement(EnterPassword, "AimHigh123");
    }

    public void setEnterConfirmPassword() {
        sendTextToElement(EnterConfirmPassword, "AimHigh123");
    }

    public void clickOnSaveButton() {
        clickOnElement(ClickOnSave);
    }
}
