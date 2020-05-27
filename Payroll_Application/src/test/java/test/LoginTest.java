package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass {
	
	LoginPage l;
  @Test(priority=1)
  public void loginTestDetails() {
	  
	  l=new LoginPage(driver);
	  l.loginPageDetails();
	  
  }
  @Test(priority=2)
  public  void loginValidationTest() {
	  
     boolean p=l.loginvalidation();
     Assert.assertTrue(p);
	
  }
}
