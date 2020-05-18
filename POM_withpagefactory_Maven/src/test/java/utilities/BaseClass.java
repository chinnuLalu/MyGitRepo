package utilities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
 
	public WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Guest\\\\Desktop\\\\Chrome\\\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://executeautomation.com/demosite/Login.html");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	  
	  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
