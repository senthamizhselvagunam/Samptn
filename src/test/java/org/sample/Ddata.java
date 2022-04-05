package org.sample;

import java.sql.DriverPropertyInfo;

import org.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ddata extends Baseclass {

	
	@BeforeClass
	private void browser() {
		launchbrowser();
		maxmizewindow();
		}
	
	@Test(dataProvider="eaytc",dataProviderClass=C.class)
	private void tc1(String user,String pass) throws InterruptedException {
		
		passurl("https://www.etsy.com/");
		WebElement sin = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
		sin.click();
		Thread.sleep(3000);
		WebElement us = driver.findElement(By.name("email"));
		sendkeys(us, user);
		WebElement pas = driver.findElement(By.name("password"));
		sendkeys(pas, pass);
		WebElement btn = driver.findElement(By.name("submit_attempt"));
		btn.click();
		Thread.sleep(3000);
	}
	
	
}