package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.Utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By EnterUsername = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]");
    By SelectUserRole = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i");
    By SelectAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By StatusSelect = By.xpath("//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div");
    By SelectDisable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By SelectEnable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]");
    By clickSearch = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By VerifyResult = By.xpath("//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]");
    By ClickCheckbox = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]");
    By ClickDelete = By.xpath("//div[@class='oxd-table-cell-actions']/button[1]/i[1]");
    By PopUp = By.xpath("//div[@class='orangehrm-modal-footer']/button[2]");
    By VerifyMsg = By.xpath("//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]");
    By SearchBtn = By.xpath("//div[@class='oxd-table-filter-area']/form[1]/div[2]/button[2]");
    By VerifyNoRecord = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']");

    public void enterUser() {
        sendTextToElement(EnterUsername, "DD Patel");
    }

    public void SelectUserRole() throws InterruptedException {
        clickOnElement(SelectUserRole);
        Thread.sleep(2000);
        clickOnElement(SelectAdmin);
    }

    public void SelectStatusDisable () throws InterruptedException {
        clickOnElement(StatusSelect);
        Thread.sleep(2000);
        clickOnElement(SelectDisable);
    }

    public void SelectStatusEnable () throws InterruptedException {
        clickOnElement(StatusSelect);
        Thread.sleep(2000);
        clickOnElement(SelectEnable);
    }

    public void ClickSearchButton() {
        clickOnElement(clickSearch);
    }

    public String VerifyResultList() {
        return getTextFromElement(VerifyResult);
    }

    public void clickOnCheckbox() {
        clickOnElement(ClickCheckbox);
    }

    public void ClickDeleteButton() throws InterruptedException {
        clickOnElement(ClickDelete);
        Thread.sleep(2000);
    }

    public void PopUpClick() throws InterruptedException {
        clickOnElement(PopUp);
        Thread.sleep(2000);
    }

    public void VerifyMsgCheck() {
        clickOnElement(VerifyMsg);
    }

    public void SearchButtonDelete() {
        clickOnElement(SearchBtn);
    }

    public String VerifyNoRecordFound() {
        return getTextFromElement(VerifyNoRecord);
    }
}


