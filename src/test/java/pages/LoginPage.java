package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By signIn = By.linkText("Sign In");
    By email = By.name("userLoginId");
    By password = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");

    // Actions
    public void clickSignIn() {
        driver.findElement(signIn).click();
    }

    public void enterEmail(String user) {
        driver.findElement(email).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}