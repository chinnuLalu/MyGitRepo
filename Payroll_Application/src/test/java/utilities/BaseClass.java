package utilities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
  public WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest\\Desktop\\Chrome\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.qabible.in/payrollapp");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  
	 // driver.close();
  }

}
