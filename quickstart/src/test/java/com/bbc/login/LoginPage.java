package com.bbc.login;

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

    @FindBy(xpath = "//*[contains(@id, 'user-identifier-input')]")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains(@id, 'password-input')]")
    private WebElement passwdField;

    @FindBy(xpath = "//*[contains(@id,  'submit-button')]")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[contains(@id,  'idcta-username')]")
    private WebElement yourAccount;



    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
    }

    public void clickSingIn() {
        singIn.click();
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void clickLoginField() {
        loginField.click();
    }

    public void clickPasswdField() {
        passwdField.click();
    }
    public void clickYourAccount() {
        yourAccount.click();
}
}
