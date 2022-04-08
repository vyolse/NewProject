package com.bbc.login;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class LoginTest {
        public static LoginPage loginPage;
        public static WebDriver driver;

        @BeforeClass
        public static void setup() {
            System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
            driver = new ChromeDriver();
            loginPage = new LoginPage(driver);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(ConfProperties.getProperty("bbc"));
        }

        @Test
        public void loginTest() {
            try {
                loginPage.clickSingIn();
                loginPage.clickLoginField();
                loginPage.inputLogin(ConfProperties.getProperty("login"));
                loginPage.clickPasswdField();
                loginPage.inputPasswd(ConfProperties.getProperty("password"));
                loginPage.clickLoginBtn();//Войти
                loginPage.clickYourAccount();
                System.out.println("Авторизация проведена успешно");
            }
            catch (Exception e) {
                e.printStackTrace();
            System.out.println("Вход не выполнен");
            }
                      }


        @AfterClass
        public static void tearDown() {
            driver.quit(); }
    }


