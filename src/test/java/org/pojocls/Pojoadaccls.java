package org.pojocls;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoadaccls extends Baseclass {

	public Pojoadaccls() {
		PageFactory.initElements(driver, this);

	}

	//@FindBy(id = "username")
	//private WebElement txtusr;

	//@FindBy(id = "password")
	//private WebElement txtpass;

   //@FindBy(id = "login")
	//private WebElement txtlgn;

	@FindBy(xpath="//option[@value=\"Sydney\"]")
	private WebElement txtloc;
	@FindBy(xpath="//option[text()='Hotel Sunshine']") 
	private WebElement txthot;
	@FindBy(xpath="//option[text()='Standard']")
	private WebElement txtroom;
	@FindBy(xpath="(//option[text()='1 - One'])[1]")
	private WebElement txtadult;
    @FindBy(xpath="(//option[text()='2 - Two'])[3]")
    private WebElement txtadultroom;
    @FindBy(id="Submit")
    private WebElement txtsubmit;
    @FindBy(id="radiobutton_0")
    private WebElement txtclick;
    @FindBy(id="continue") 
    private WebElement txtcont;
    @FindBy(xpath="//option[text()='American Express']")
    private WebElement cardtype;
    @FindBy(xpath="//option[text()='February']")
    private WebElement expmnth;
   
    @FindBy(id="book_now")
    private WebElement bknw;
    
    
    

	
	
	
	public WebElement getBknw() {
		return bknw;
	}
	public WebElement getExpmnth() {
		return expmnth;
	}
	public void setExpmnth(WebElement expmnth) {
		this.expmnth = expmnth;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public  WebElement getTxtloc() {
		return txtloc;
	}
	public WebElement getTxthot() {
		return txthot;
	}
	public WebElement getTxtroom() {
		return txtroom;
	}
	public WebElement getTxtadult() {
		return txtadult;
	}
	public WebElement getTxtadultroom() {
		return txtadultroom;
	}
	public WebElement getTxtsubmit() {
		return txtsubmit;
	}
	public WebElement getTxtclick() {
		return txtclick;
	}
	public WebElement getTxtcont() {
		return txtcont;
	}
	
    
}









