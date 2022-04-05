package org.baseclass;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass  {

        public static WebDriver driver;
        public static Robot r;
        public static Alert a;
        public static Actions as;
        public static JavascriptExecutor j;
        public static TakesScreenshot t;
		public static Select s;
		
		 public static  void launchbrowser() {
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		}
		 
		 public static void passurl(String url) {
		  driver.get(url);

		}
		 
		 public static void getcurrenturl(String currenturl) {
			driver.getCurrentUrl();
			System.out.println("String currenturl");

		}
		 public static void maxmizewindow() {
			driver.manage().window().maximize();
		}
		 
		public static void implicitywaits() {
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		}
		 public static void click(WebElement e) {
			 e.click();
	

		}
		 
		 public static void sendkeys(WebElement e, String Value) {
			 e.sendKeys(Value);
			
		}
		 
		  
		
		public static void quit() {
			driver.quit();

		}
		public static void close() {
			driver.close();

		}
		
		
		
		 public static void dragAnddrop(WebElement from ,WebElement To) {
			 Actions a = new Actions(driver);
			 a.dragAndDrop(from, To).perform();
			
		}
		 public static void movetoelement(WebElement e) {
			Actions a=new Actions(driver);
			a.moveToElement(e).perform();

		}
		 public static void actionsclick(WebElement e) {
			Actions a=new Actions(driver);
			a.moveToElement(e).perform();
		}
		 
		 public static void doubleclick(WebElement e) {
			 Actions a=new Actions(driver);
			 a.doubleClick(e).perform();
		}
		 
		 public static void contextclick(WebElement e) {
			 Actions a=new Actions(driver);
			 a.contextClick(e).perform();
			
		}
		 public static void simpleAlert() {
			Alert a=driver.switchTo().alert();
            a.accept();
		}
		 
	    public static void confirmalert() {
		  Alert a=driver.switchTo().alert();
		  a.dismiss();

		}
		
	    public static void promptalert(String value) {
			Alert a=driver.switchTo().alert();
             a.sendKeys(value);
             a.accept();
		}
		
		public static void selectbyIndex(WebElement e,int index) {
			Select s= new Select(e);
			s.selectByIndex(index);
			

		}
		
		public static  void selectbyValue(WebElement e,String Value) {
			Select s=new Select(e);
			s.selectByValue(Value);
			

		}
		public static void selectbyVisibletext(WebElement e,String text) {
			Select s=new Select(e);
			s.selectByVisibleText(text);
			

		}
		public static boolean isMultiple(WebElement e) {
	     Select s=new Select(e);
	     return s.isMultiple();

		}
		
		public static void getFirstSelectedOption(WebElement e) {
			Select s=new Select(e);
			WebElement firstOption = s.getFirstSelectedOption();
             firstOption.click();
		}
		
		public static void deselectedbyIndex(WebElement e,int index) {
			Select s=new Select(e);
			s.deselectByIndex(index);
			
			
		}
		public static void deselectedbyValue(WebElement e,String Value) {
			 Select s=new Select(e);
			 s.deselectByValue(Value);

		}
		
		public static void deselectedbyVisibletext(WebElement e,String Text) {
			Select s=new Select(e);
			s.deselectByVisibleText(Text);
		}
		
		public static void deSelectedAll(WebElement e) {
			Select s=new Select(e);
			s.deselectAll();

		}
		
		
		public static void Screenshot(String name) throws IOException {
			TakesScreenshot tk=(TakesScreenshot) driver;
			File src=tk.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\senth\\eclipse-workspace1\\junitsam\\target\\Screenshot\\"+name+".png");
			FileUtils.copyFile(src, des);
		}
		 public static void scrolldown(WebElement e) {
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView(false)", e);
		}
		 
		 public static void scrollup(WebElement e) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(True)", e);

		}
		
		 public static void javaclick(WebElement e) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)", e);
		}
		
		 public static void frameIndex(int index) {
			driver.switchTo().frame(index);

		}
		 
		 public static void frameName(String Name) {
			driver.switchTo().frame(Name);

		}
		public static void frameWebElement(WebElement e) {
			driver.switchTo().frame(e);

		}
		
		public static void defaultContent() {
			driver.switchTo().defaultContent();

		}
		 public static void parentFrame() {
			driver.switchTo().parentFrame();

		}
		 public static void gethandle() {
			driver.getWindowHandle();
		 }
		  public static void gethandles(int index) {
			Set<String> st = driver.getWindowHandles();
		    
		}
		   public static void tourl(String url) {
			  driver.navigate().to(url);
		}
		 
		public static void back() {
			driver.navigate().back();

		}
		public static void forward() {
			driver.navigate().forward();

		}
		public static void refresh() {
			driver.navigate().refresh();

		}
		 
		public static void isDisplayed(WebElement e) {
			e.isDisplayed();
			
			
		}
		public static void isselected(WebElement e) {
			e.isSelected();
			
		}
		
		public static  void isEnabled(WebElement e) {
			e.isEnabled();
		}

		
		
		public static void toCopy() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		
		}		
		
		public static void toPaste() throws AWTException {
		r=new  Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		
} 
		 
		 
}
		 
		 
		
		

	
		 

	
	
