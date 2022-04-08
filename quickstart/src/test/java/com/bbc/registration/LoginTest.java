package com.bbc.registration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

    public class LoginTest {
        public static LoginPage loginPage;
        public static WebDriver driver;

        @BeforeClass
        public static void setup() {
            System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
            driver = new ChromeDriver();
            loginPage = new LoginPage(driver);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(ConfProperties.getProperty("bbc"));

        }

            @Test
            public void loginTest() {

                loginPage.clickSingIn();
                loginPage.clickRegisterNow ();
                loginPage.clickOrOver();
                loginPage.dayInput(ConfProperties.getProperty("day"));
                loginPage.monthInput(ConfProperties.getProperty("month"));
                loginPage.yearInput(ConfProperties.getProperty("year"));
                loginPage.clickSubmitButton();
                //loginPage.clickUserIdentifierInput();
                loginPage.userIdentifierInput(ConfProperties.getProperty("loginreg"));
                //loginPage.clickPasswordInput();
                loginPage.PasswordInput(ConfProperties.getProperty("passwordreg"));
                if (ConfProperties.getProperty("passwordreg").length()<8) {
                    System.out.println("Извините, этот пароль слишком короткий. " +
                            "В нём должно быть не менее 8 символов. " +
                            "Регистрация не пройдена.");
                }

                else {

                loginPage.clickSubmitButton();}
}
        @AfterClass
        public static void tearDown() {
            driver.quit(); }
    }


