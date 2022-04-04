package ru.diary;

import org.junit.AfterClass;
import org.junit.Assert;
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
            driver.get(ConfProperties.getProperty("loginpage"));
        }

        @Test
        public void loginTest() {
            loginPage.inputLogin(ConfProperties.getProperty("login"));
            loginPage.inputPasswd(ConfProperties.getProperty("password"));
            loginPage.clickLoginBtn();
            String actualUrl = "https://diary.ru/";
            String expectedUrl = driver.getCurrentUrl();
            if (actualUrl.equalsIgnoreCase(expectedUrl)) {
                System.out.println("Вход выполнен");
            } else {
                System.out.println("Вход не выполнен, возможно, там капча");
            }
            Assert.assertEquals(actualUrl, expectedUrl);
        }
        @AfterClass
        public static void tearDown() {
            driver.quit(); }
    }
