package pagesfortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Page object that models the SauceDemo login page and exposes reusable login actions.
public class loginpage {	

	// Initialize the PageFactory so the annotated web elements are ready for use.
	public loginpage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}

	// Locator for the user name input field.
	@FindBy(id="user-name")
	WebElement usernameinput;


	// Locator for the password input field.
	@FindBy(id="password")
	WebElement passwordinput;

	// Locator for the login button.
	@FindBy(xpath="//*[@id='login-button']")
	WebElement loginbutton;


	// Clear the user name field and enter the supplied user name.
	public void enterusername(String username)
	{
		usernameinput.clear();
		usernameinput.sendKeys(username);
	}

	// Clear the password field and enter the supplied password.
	public void enterpassword(String password)
	{
		passwordinput.clear();
		passwordinput.sendKeys(password);
	}
	// Click the login button to submit the credentials.
	public void loginbutton() 
	{
		loginbutton.click();
	}
	
	// Convenience method that performs the complete login sequence in one call.
	public void loginAs(String username, String password) {

		enterusername(username);
		enterpassword(password);
		loginbutton();

	}

}



