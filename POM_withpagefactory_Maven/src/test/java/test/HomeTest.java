package test;

import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.LoginPage;
import utilities.BaseClass;

public class HomeTest extends BaseClass {
	
	LoginPage l;
	HomePage h;
  @Test
  public void homeTestDetails() {
	  
	  l=new LoginPage(driver);
	  l.loginDetails();
	  
	  h=new HomePage(driver);
	  h.homePageDetails();
	  
	 
  }
}
