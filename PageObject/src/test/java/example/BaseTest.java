package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;
    public String baseURL = "https://www.olx.ua/";

    @BeforeMethod
    public void setup() throws MalformedURLException {
        //Create a Chrome driver. All test classes use this.
        driver = new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());

        //Maximize Window
        driver.manage().window().fullscreen();

        //Instantiate the Page Class
        page = new Page(driver);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}