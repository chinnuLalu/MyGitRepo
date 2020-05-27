package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.WorkerDetails;
import pageObject.WorkerPage;
import utilities.BaseClass;

public class WorkerTest extends BaseClass {
	WorkerPage w;
	LoginPage l;
    //WorkerDetails wd;
  @Test(priority=0)
  public void workerDetails() throws InterruptedException {
	  
	   l=new LoginPage(driver);
	  l.loginPageDetails();
	   w=new WorkerPage(driver);
	   //w.pageCountDetails();
	  w.WorkerSearch();
	  
	  //wd.workerDetailsPage();
	  //wd.workerBankDetails();
	  
  }
  @Test(priority=1)
  public void workerValidationTest() {
	  boolean q=w.workerPageValidation();
	  Assert.assertTrue(q);
  }
 /* @Test(priority=1)
  public void pageCountDetails() throws InterruptedException {
	  boolean a=w.pageCountDetails();
	  Assert.assertTrue(a);
	 
  }*/
  /*@Test
  public  void loginValidationTest() {
	  
	     boolean p=l.loginvalidation();
	     Assert.assertTrue(p);
		
	  }*/
}
