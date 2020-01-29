package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageGenerator {
	
	protected WebDriver driver;

	// Constructor
	public PageGenerator(WebDriver driver) {
		this.driver = driver;
	}

	// JAVA Generics to Create and return a New Page
	public <TPage extends Page> TPage GetInstance(Class<TPage> pageClass) {
		// Initialize the Page with its elements and return it.
		return PageFactory.initElements(driver, pageClass);
	}
}
