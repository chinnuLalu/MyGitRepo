package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	@CacheLookup
	@FindBy(name="TitleId")
	WebElement ob;
	@CacheLookup
	@FindBy(name="Initial")
	WebElement user;
	@CacheLookup
	@FindBy(name="FirstName")
	WebElement user1;
	@CacheLookup
	@FindBy(name="MiddleName")
	WebElement user2;
	@CacheLookup
	@FindBy(name="Female")
	WebElement user3;
	@CacheLookup
	@FindBy(name="Hindi")
	WebElement user4;
	@CacheLookup
	@FindBy(name="Save")
	WebElement user5;
	
	public void homePageDetails() {
		
		Select s=new Select(ob);
		s.selectByValue("2");
		
		user.sendKeys("nill");
		user1.sendKeys("Chinnu");
		user2.sendKeys("Lalu");
		user3.click();
		user4.click();
		user5.submit();
		
		}
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
