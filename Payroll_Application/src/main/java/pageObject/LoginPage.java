package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;
	
	@CacheLookup
	@FindBy(name="LoginForm[username]")
	WebElement user;
	@CacheLookup
	@FindBy(name="LoginForm[password]")
	WebElement password;
	@CacheLookup
	@FindBy(name="login-button")
	WebElement login;
	
	public void loginPageDetails() {
		
		user.sendKeys("carol");
		password.sendKeys("1q2w3e4r");
		login.click();
	}
	public  boolean loginvalidation() {
		
		boolean b=user.isDisplayed();
		System.out.println(b);
		return b;
		
		
				}
	
public LoginPage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
