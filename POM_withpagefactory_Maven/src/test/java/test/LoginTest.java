package test;

import org.testng.annotations.Test;

import pageobject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass{
	LoginPage l;
  @Test
  public void login() {
	  
	  l=new LoginPage(driver);
	  l.loginDetails();
	  
  }
}
