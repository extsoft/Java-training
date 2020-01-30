package example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import example.Page;

public class AccountBar extends Page {

	// *********Constructor*********
	public AccountBar(WebDriver driver) {
		super(driver);
	}

	// *********Web Elements By Using Page Factory*********
	@FindBy(how = How.ID, using = "topLoginLink")
	public WebElement myAccount;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'мова')]")
	public WebElement ukrainianLink;


	// Go to LoginPage
	public void clickMyAccountButton() {
		click(myAccount);
	}
	// Select Ukrainian language
	public void clickUkrainianLink() {
		click(ukrainianLink);
	}
}
