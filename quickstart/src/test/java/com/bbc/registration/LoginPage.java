package com.bbc.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'idcta-username')]")
    private WebElement singIn;

    @FindBy(xpath = "//span[text()='Register now']")
    private WebElement registerNow;

    @FindBy(xpath = "//span[text()='16 or over']")
    private WebElement OrOver;

    @FindBy(xpath = "//*[contains(@id,  'day-input')]")
    private WebElement dayInput;

    @FindBy(xpath = "//*[contains(@id,  'month-input')]")
    private WebElement monthInput;

    @FindBy(xpath = "//*[contains(@id,  'year-input')]")
    private WebElement yearInput;

    @FindBy(xpath = "//*[contains(@id,  'submit-button')]")
    private WebElement submitButton;

    @FindBy(xpath = "//*[contains(@id,  'user-identifier-input')]")
    private WebElement userIdentifierInput;

    @FindBy(xpath = "//*[contains(@id,  'password-input')]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[contains(@class, 'form-message__text')]")
    private WebElement answer;


    public void clickSingIn() {
        singIn.click();
    }

    public void clickRegisterNow() {
        registerNow.click();
    }

    public void clickOrOver() {
        OrOver.click();
    }

    public void dayInput(String day) {
        dayInput.sendKeys(day);
    }

    public void monthInput(String month) {
        monthInput.sendKeys(month);
    }

    public void yearInput(String year) {
        yearInput.sendKeys(year);
    }
    public void clickSubmitButton() {
        submitButton.click();
    }
    public void clickUserIdentifierInput() {
        userIdentifierInput.click();
    }
    public void userIdentifierInput(String login) {
        userIdentifierInput.sendKeys(login);
    }
    public void clickPasswordInput() {
        passwordInput.click();
    }
    public void PasswordInput(String password) {
        passwordInput.sendKeys(password);
    }

}
