package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkerPage {

	public WebDriver driver;
	@CacheLookup
	@FindBy(xpath="//input[@id=\"workersearch-first_name\"]")
	WebElement Fname;
	@CacheLookup
	@FindBy(xpath="//input[@id=\"workersearch-last_name\"]")
	WebElement Lname;
	@CacheLookup
	@FindBy(xpath="//input[@id=\"workersearch-postcode\"]")
	WebElement postcode;
	@CacheLookup
	@FindBy(xpath="//input[@id=\"workersearch-ni_number\"]")
	WebElement ni_number;
	@CacheLookup
	@FindBy(xpath="//button[@type=\"submit\" and @class=\"btn btn-primary\"]")
	WebElement search;
	@CacheLookup
	@FindBy(xpath="//a[@href=\"/payrollapp/worker/index\" and contains(text(),'Workers')]")
	WebElement worker;
	@CacheLookup
	@FindBy(xpath="//a[@href=\"/payrollapp/worker/create\"]")
	WebElement createworker;
	@CacheLookup
	@FindBy(xpath="//a[@href=\"/payrollapp/worker/update?id=299\"]")
	WebElement update;
	@CacheLookup
	@FindBy(id="worker-employment_type")
	WebElement type;
	@CacheLookup
	@FindBy(xpath="//button[@type=\"submit\" and text()=\"Next\"]")
	WebElement next;
	@CacheLookup
    @FindBy(xpath="//button[@type=\"submit\" and text()=\"Save\"]")
    WebElement save;
	@CacheLookup
	@FindBy(xpath="//a[@href=\"/payrollapp/worker/index?page=2\"] ")
	WebElement pagecount;
	
	
	public void WorkerSearch() throws InterruptedException {
		
		Actions act=new Actions(driver);
		//WebElement worker=driver.findElement(By.xpath("//a[@href=\"/payrollapp/worker/index\" and contains(text(),'Workers')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		act.moveToElement(worker).build().perform();
		worker.click();
		//WebElement fname1=driver.findElement(By.xpath("//input[@id=\"workersearch-first_name\"]"));
		Fname.sendKeys("chako");
		Thread.sleep(3000);
		search.click();
		System.out.println("search test pass");
		//WebDriverWait wa=new WebDriverWait(driver,10);
		//wa.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type=\"submit\" and @class=\"btn btn-primary\"]"))));
	}
	public void updatesearch() throws InterruptedException {
		
		Thread.sleep(3000);
	 update.click();
	 Select s=new Select(type);
	 s.selectByIndex(1);
	 next.submit();
	 save.submit();
	 System.out.println("Successfully updated");
	 
	
		
	}
	/*public void pageCountDetails() {
		
		pagecount.click();
		System.out.println("next page viewed");
		//boolean s=pagecount.isSelected();
		
	}*/
	public boolean workerPageValidation() {
		boolean c=search.isDisplayed();
		System.out.println(c);
		return c;
	}
	public String tileget() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
		
	}
	public WorkerPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
