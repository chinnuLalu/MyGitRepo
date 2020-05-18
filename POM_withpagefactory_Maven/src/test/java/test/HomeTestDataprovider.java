package test;

import org.testng.annotations.Test;

import pageobject.HomeDataprovider;
import pageobject.LoginDataprovider;
import utilities.BaseClass;
import utilities.BaseClassDataprovider;

public class HomeTestDataprovider extends BaseClassDataprovider {
  @Test(dataProvider="dp")
  public void home(String n, String p, String e) {
	  
	  System.out.println(n +p);
	  LoginDataprovider l=new LoginDataprovider(driver);
	  l.loginDetails(n, p);
	  HomeDataprovider h=new HomeDataprovider(driver);
	  h.homePageDetails(e);
	  
  }
}