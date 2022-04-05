package org.sample;

import org.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class Homepot extends Baseclass {
	@DataProvider(name="search items")
	
	 private String[][] txtsearch() {
		return new String[][] {
			
			
			
			
		};
		

	}
	@Test(dataProvider="search items")
 private void homepageopen() {
	   launchbrowser();
	   passurl("https://www.homedepot.com/");
	   WebElement srch = driver.findElement(By.id("headerSearch"));
	   sendkeys(srch, "78766");

}
			
	
		

	}
	


