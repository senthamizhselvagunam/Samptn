package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojocls.Pojocls;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class B extends Pojocls {
	@BeforeClass
	private void browser() {
		launchbrowser();
		maxmizewindow();

	}
	@Test(dataProvider = "fb",dataProviderClass=A.class)
	public void test4(String mail, String pass) throws InterruptedException {
		passurl("https://www.target.com/");
		WebElement sgnin = driver.findElement(By.xpath("//span[text()='Sign in']"));
		sgnin.click();
		WebElement c = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		c.click();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.id("username"));
		sendkeys(email, mail);
		WebElement pas = driver.findElement(By.id("password"));
		sendkeys(pas, pass);
		Thread.sleep(3000);
		

	}
	
	

	

}
