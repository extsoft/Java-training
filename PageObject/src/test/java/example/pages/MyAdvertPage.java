package example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import example.Page;

public class MyAdvertPage extends Page {
    
	//*********Constructor*********
	public MyAdvertPage(WebDriver driver) {
		super(driver);
	}

	//*********Page Selector*********
	//You can use this approach instead of @FindBy
    public By messageLink = By.cssSelector("#se_accountAnswers span.link.fbold");

	//*********Page Methods*********
    public void waitForMessageLink (){
    	WebDriverWait localWait = new WebDriverWait(driver, 10);
    	localWait.until(ExpectedConditions.visibilityOfElementLocated(messageLink));
    }
}
