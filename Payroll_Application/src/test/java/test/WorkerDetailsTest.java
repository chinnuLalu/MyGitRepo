package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.WorkerDetails;
import pageObject.WorkerPage;
import utilities.BaseClass;

public class WorkerDetailsTest extends BaseClass {
	WorkerPage w;
	LoginPage l;
	WorkerDetails wd;

  @Test(priority=0)
  public void loginWorkerDetails() throws InterruptedException {
	  
	  l=new LoginPage(driver);
	  l.loginPageDetails();
	  
		   boolean p=l.loginvalidation();
		   Assert.assertTrue(p);
		   System.out.println("test pass");
  }
  @Test(priority=1)
  public void searchWorkerDetails() throws InterruptedException {
	  
	  w=new WorkerPage(driver);
	  w.WorkerSearch();
	     String tit=w.tileget();
	     Assert.assertEquals(tit, "Workers");
	    
	    boolean c=w.workerPageValidation();
	     Assert.assertTrue(c);
	     System.out.println("Test pass");
	     w.updatesearch();
	  //w.pageCountDetails();
  }
  @Test(priority=2)
  public void workersDetails() throws InterruptedException {
	  wd=new WorkerDetails(driver);
	 wd.workerDetailsPage();
	   //String title2=wd.getTitleWorkerDetails();
	   //Assert.assertEquals(title2, "Create Worker");
	 wd.workerBankDetails();
	    String title3=wd.getTitleSavedPage();
	    Assert.assertEquals(title3, "Production");
	// wd.deleteWorker();
	  
  }
  /*@Test(priority=1)
  public  void loginValidationTest() {
	  
	     boolean p=l.loginvalidation();
	     Assert.assertTrue(p);
		
	  }*/
}
