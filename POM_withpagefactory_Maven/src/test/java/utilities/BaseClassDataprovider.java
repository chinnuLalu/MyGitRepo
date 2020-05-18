package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class BaseClassDataprovider {
	
	public WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Guest\\\\Desktop\\\\Chrome\\\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://executeautomation.com/demosite/Login.html");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	  
	   }
  
  @DataProvider
  public Object[][] dp() throws BiffException, IOException{
	  
			FileInputStream f= new FileInputStream("C:\\Users\\Guest\\Desktop\\SeleniumExecution.xls");
			Workbook w= Workbook.getWorkbook(f);
			Sheet s=w.getSheet("Sheet1");
			int rw=s.getRows();
			int co=s.getColumns();
			System.out.println("Row "+rw+" Columns "+co);
			String[][] input=new String[rw][co];
			for(int i=0;i<rw;i++) {
				
				for(int j=0;j<co;j++) {
					Cell c=s.getCell(j, i);
					input[i][j]=c.getContents();
				}
			}
			return input;
			
	  
  }
  
  
  
  @AfterMethod
  public void afterClass() {
	  driver.quit();
  }
}
