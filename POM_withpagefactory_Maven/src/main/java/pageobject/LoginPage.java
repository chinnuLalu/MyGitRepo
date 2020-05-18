package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@CacheLookup
	@FindBy(name="UserName")
	WebElement user;
	@CacheLookup
	@FindBy(name="Password")
	WebElement password;
	@CacheLookup
	@FindBy(how=How.NAME,using="Login")
	//@FindBy(name="Login")
	WebElement login;
	
	public void loginDetails() {
		
		//WebElement user=driver.findElement(By.name("UserName"));
		driver.navigate().refresh(); //create stale element exception when @findBy is not used to find elements
		user.sendKeys("tutorial");
		//WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("tutorial");
		//WebElement login=driver.findElement(By.name("Login"));
		login.submit();
		
	}
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
