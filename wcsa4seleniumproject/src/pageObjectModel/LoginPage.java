package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//TO AVOID STATEREFRENCEEXCEPTION

	@FindBy (name="username") private WebElement usernameTB;
	@FindBy (name="pwd")private WebElement passwordTB;
	@FindBy (id ="loginButton")private WebElement LoginButton;
	@FindBy (id ="keepLoggedInCheckBox") private WebElement LoggedInCheckBox;
	@FindBy (xpath = "//a[.='Actimind Inc.']")private WebElement ActiMindLink;
	@FindBy (id ="licenseLink")private WebElement LicenseLink;
	
	
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	// utilization
	
	public WebElement getUsernameTB() {
		return usernameTB;
	}


	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getLoginButton() 
	{
		return LoginButton;
	}


	public WebElement getLoggedInCheckBox() {
		return LoggedInCheckBox;
	}


	public WebElement getActiMindLink() {
		return ActiMindLink;
	}


	public WebElement getLicenseLink() {
		return LicenseLink;
	}

	// operational method
	
	public void actiTimeValidLogin(String validusername,String validpassword) throws InterruptedException
	{
		usernameTB.sendKeys(validusername);
		Thread.sleep(2000);
		passwordTB.sendKeys(validpassword);
		Thread.sleep(2000);
		LoginButton.click();
	}
	
	public void actiTimeInValidLogin(String invalidusername,String invalidpassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidusername);
		Thread.sleep(2000);
		passwordTB.sendKeys(invalidpassword);
		Thread.sleep(2000);
		LoginButton.click();
		Thread.sleep(2000);
		usernameTB.click();
	}
    
	
	
	
	
	
}
