package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import factory.BrowserFactory;
import utility.ConfigDataProvider;

public class BaseClass {

    protected WebDriver driver;
    protected ConfigDataProvider config;

    @BeforeClass
    public void setup() throws IOException {

        config = new ConfigDataProvider();

        driver = BrowserFactory.startApplication(
                driver,
                config.getBrowser(),
                config.getApplicationUrl());
    }

    @AfterClass
    public void tearDown() {

        BrowserFactory.quitBrowser(driver);
    }
}