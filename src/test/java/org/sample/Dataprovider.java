package org.sample;

import org.baseclass.Baseclass;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.pojocls.Pojocls;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider extends Baseclass {
	
//	@DataProvider(name="login")
//	  public String[][] logindata() {
//		return new String[][] {
//			
//			{"abi@123","greens@54354"},
//			{"hari@gmail","tech123"},
//			{"senthu123","123"}
//			
//		};
//	}
	@DataProvider(name="Register")
	
	   public Object[][] register() {
		 return new Object[][] {
				 
				 {"selenium","47878885"},
				 {"abi@123","1234646877"}
		 };

	}
	
  @Test(dataProvider="Register")
   public void tc1(String user,String pass) throws InterruptedException {
	  
	  Pojocls p=new Pojocls();
	  WebElement txtusr = p.getTxtusr();
	  sendkeys(txtusr, user);
	  WebElement txtpass = p.getTxtpass();
	  sendkeys(txtpass, pass);
	  Thread.sleep(5000);
	  
	

}
	@BeforeMethod
	   private void bfmtd() {
		 launchbrowser();
		 passurl("https://www.facebook.com/");

	}
	@AfterMethod
	
	private void aft() {
		driver.quit();

	}
	
	
	
	
	
	
}
