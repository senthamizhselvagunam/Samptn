package org.sample;

import org.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 extends Baseclass{
	
	@DataProvider(name="Search")

	  private String[][] txtsearch() {
		  return new String[][] {
			  {"Apple watch"}
			  
			  
		  };
		
		  
		  
	}
	@Test(dataProvider="Search")
	  private void openarlington(String search) {
		launchbrowser();
		passurl("https://www.target.com/");
		WebElement srch = driver.findElement(By.id("search"));
		sendkeys(srch,search );
		WebElement c = driver.findElement(By.xpath("//button[@class=\"styles__SearchButton-sc-17dxxwu-24 hfLkTW\"]"));
		c.click();
//		WebElement d = driver.findElement(By.xpath("//a[text()='Apple Watch Series 3 (GPS) Aluminum Case']"));
//		String text = d.getText();
//		System.out.println(text);
}
	
	

	   
	   
	
	
}