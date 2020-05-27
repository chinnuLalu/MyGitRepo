package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WorkerDetails {
	
	 WebDriver driver;
	@CacheLookup
	@FindBy(id="worker-title")  
	WebElement title;
	@CacheLookup
	@FindBy(id="worker-known")
	WebElement known;
	@CacheLookup
	@FindBy(id="worker-phone")
	WebElement phone;
	@CacheLookup
	@FindBy(id="worker-mobile")
	WebElement mobile;
	@CacheLookup
	@FindBy(id="worker-email")
	WebElement email;
	@CacheLookup
	@FindBy(id="worker-gender")
	WebElement gender;
	@CacheLookup
	@FindBy(id="worker-middle_name")
	WebElement mname;
	@CacheLookup
	@FindBy(id="worker-dob")
	WebElement DOB;
	@CacheLookup
	@FindBy(id="worker-address1")
	WebElement address1;
	@CacheLookup
	@FindBy(id="worker-address2")
	WebElement address2;
	@CacheLookup
	@FindBy(id="worker-address3")
	WebElement address3;
	@CacheLookup
	@FindBy(id="worker-branch_id")
	WebElement branch;
	@CacheLookup
	@FindBy(id="worker-division_id")
	WebElement division;
	@CacheLookup
	@FindBy(id="worker-employment_type")
	WebElement type;
	@CacheLookup
	@FindBy(id="worker-payslip_method")
	WebElement payslip;
	@CacheLookup
	@FindBy(id="worker-engage_status")
	WebElement engagestatus;
	@CacheLookup
	@FindBy(id="worker-country")
	WebElement country;
	@CacheLookup
	@FindBy(xpath="//button[@type=\"submit\" and text()=\"Next\"]")
	WebElement Nextbutton;
	@CacheLookup
	@FindBy(xpath="//a[@href=\"/payrollapp/worker/create\"]")
	WebElement createworker;
	@CacheLookup
	@FindBy(xpath="//a[@href=\"/payrollapp/worker/index\" and contains(text(),'Workers')]")
	WebElement worker;
    @CacheLookup
    @FindBy(id="worker-payment_method")
    WebElement payment_method;
    @CacheLookup
    @FindBy(id="worker-ac_type")
    WebElement accountType;
    @CacheLookup
    @FindBy(id="worker-ac_name")
    WebElement accountName;
    @CacheLookup
    @FindBy(id="worker-ac_no")
    WebElement acctNo;
    @CacheLookup
    @FindBy(id="worker-sort_code")
    WebElement sortCode;
    @CacheLookup
    @FindBy(id="worker-start_date")
    WebElement startDate;
    @CacheLookup
    @FindBy(id="worker-roll_no")
    WebElement rollNo;
    @CacheLookup
    @FindBy(id="worker-bank_name")
    WebElement bankName;
    @CacheLookup
    @FindBy(id="worker-bank_address")
    WebElement bankAddredd;
    @CacheLookup
    @FindBy(xpath="//button[@type=\"submit\" and text()=\"Save\"]")
    WebElement save;
    @CacheLookup
    @FindBy(xpath="//input[@id=\"worker-first_name\"]")
    WebElement fname2;
    @CacheLookup
    @FindBy(id="worker-last_name")
    WebElement lname2;
    @CacheLookup
    @FindBy(id="worker-postcode")
    WebElement postelcode2;
    @CacheLookup
    @FindBy(id="worker-ni_number")
    WebElement ninumber2;
    @CacheLookup
    @FindBy(xpath="//a[@href=\"/payrollapp/worker/index\"]")
    WebElement worker2;
    @CacheLookup
	@FindBy(xpath="//button[@type=\"submit\" and @class=\"btn btn-primary\"]")
	WebElement search;
    @CacheLookup
	@FindBy(xpath="//input[@id=\"workersearch-first_name\"]")
	WebElement Fname;
    @CacheLookup
    @FindBy(xpath="//span[@class=\"glyphicon glyphicon-trash\"]")
    WebElement delete;
    
    public void workerDetailsPage() throws InterruptedException {
    	
    	
    	Actions act=new Actions(driver);
    	act.moveToElement(worker2).perform();
    	worker2.click();
    	act.moveToElement(createworker).perform();
    	act.build().perform();
		createworker.click();
		//Thread.sleep(3000);
    	WebElement title1=driver.findElement(By.id("worker-title"));
		Select s=new Select(title1);
		s.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		//WebElement fname2=driver.findElement(By.xpath("//input[@id=\"worker-first_name\"]"));
		fname2.sendKeys("Maya");
		lname2.sendKeys("vishvanath");
		known.sendKeys("production");
		phone.sendKeys("60748");
		mobile.sendKeys("9895460748");
		email.sendKeys("vishnu@gmail.com");
		Select s1=new Select(gender);
		s1.selectByIndex(1);
		DOB.sendKeys("14/11/1995");
		address1.sendKeys("kottarathil");
		address2.sendKeys("Kothanalloor");
		address3.sendKeys("Kottayam");
		postelcode2.sendKeys("686632");
		Select s2= new Select(branch);
		s2.selectByIndex(1);
		Select s3=new Select(division);
		s3.selectByIndex(1);
		Select s4=new Select(type);
		s4.selectByIndex(1);
		Select s5=new Select(payslip);
		s5.selectByIndex(2);
		Select s6= new Select(engagestatus);
		s6.selectByIndex(4);
		ninumber2.sendKeys("12365");
		Nextbutton.click();
		
	}
	
	public void workerBankDetails() {
		Select pm=new Select(payment_method);
		pm.selectByIndex(0);
		Select acttype=new Select(accountType);
		acttype.selectByIndex(0);
		accountName.sendKeys("ABC");
		acctNo.sendKeys("789654123");
		sortCode.sendKeys("asd123");
		startDate.sendKeys("10/05/2018");
		rollNo.sendKeys("102");
		bankName.sendKeys("SBI");
		bankAddredd.sendKeys("kothanalloor branch,kottayam");
		save.submit();
	
    }
	public String getTitleWorkerDetails() {
		String workertitle=driver.getTitle();
		System.out.println(workertitle);
		return workertitle;
	}
	public String getTitleSavedPage() {
		String title3=driver.getTitle();
		System.out.println(title3);
		return title3;
	}
	public void deleteWorker() {
		Actions act=new Actions(driver);
		act.moveToElement(worker2).build().perform();
		worker2.click();
		Fname.sendKeys("Maya");
		search.click();
		delete.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		System.out.println("worker details deleted");
		
		
	}
	public WorkerDetails(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
