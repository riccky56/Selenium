package pagesfortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {	

	//constructor
	public loginpage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}

	//locators
	@FindBy(id="user-name")
	WebElement usernameinput;


	@FindBy(id="password")
	WebElement passwordinput;

	@FindBy(xpath="//*[@id='login-button']")
	WebElement loginbutton;


	//action methods
	public void enterusername(String username)
	{
		usernameinput.clear();
		usernameinput.sendKeys(username);
	}

	public void enterpassword(String password)
	{
		passwordinput.clear();
		passwordinput.sendKeys(password);
	}
	public void loginbutton() 
	{
		loginbutton.click();
	}
	
    //calling all methods in a single method
	public void loginAs(String username, String password) {

		enterusername(username);
		enterpassword(password);
		loginbutton();

	}

}



