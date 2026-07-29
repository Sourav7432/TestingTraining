package factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

    // Start Browser
    public static WebDriver startApplication(WebDriver driver, String browser, String url) {

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
    public static void quitBrowser(WebDriver driver) {

        if (driver != null) {
            driver.quit();
        }
    }
}