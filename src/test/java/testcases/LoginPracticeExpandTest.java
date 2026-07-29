package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import utility.ConfigDataProvider;

public class LoginPracticeExpandTest {

    public WebDriver driver;
    ConfigDataProvider config;

    @BeforeClass
    public void setup() {

        try {
            config = new ConfigDataProvider();
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver = BrowserFactory.startApplication(
                driver,
                config.getBrowser(),
                config.getApplicationUrl());
    }

    @Test
    public void openNetflixHomePage() {

        System.out.println("Page Title: " + driver.getTitle());

    }

    @AfterClass
    public void tearDown() {

        BrowserFactory.quitBrowser(driver);

    }
}