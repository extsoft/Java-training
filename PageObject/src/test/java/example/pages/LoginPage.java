package example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import example.Page;
 
public class LoginPage extends Page {
 
    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }
 
    //*********Web Elements by using Page Factory*********
    //Other approach but works the same:
    //public WebElement userEmail = driver.findElement(By.id("userEmail"));
    @FindBy(how = How.ID, using = "userEmail")
    public WebElement userEmail;
    
 	
    @FindBy(how = How.CSS, using = "#userPass")
    public WebElement password;
 
    @FindBy(how = How.ID, using = "se_userLogin")
    public WebElement loginButton;
 
    @FindBy(how = How.CSS, using = "div.errorbox")
    public WebElement errorMessagePassword;
 
 
    //*********Page Methods*********
    public void login (String pusername, String ppassword){
        //Enter Username(Email)
        writeText(userEmail,pusername);
        //Enter Password
        writeText(password, ppassword);
        //Click Login Button
        click(loginButton);
    }
    
    // Reurns error text.
    public String getErrorText() {
    	return errorMessagePassword.getText();
    }
}
