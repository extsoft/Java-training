package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
public class BaseTest {
	
    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;
	public String baseURL = "https://www.olx.ua/";
    
	@BeforeMethod
    public void setup () {
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();
 
        //Maximize Window
        driver.manage().window().fullscreen();
 
        //Instantiate the Page Class
        page = new Page(driver);
    }
 
    @AfterMethod
    public void teardown () {
    	driver.quit();
    }
}