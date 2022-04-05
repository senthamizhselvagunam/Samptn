package org.pojocls;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojocls extends Baseclass {
	public Pojocls() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtusr;

	@FindBy(id = "pass")
	private WebElement txtpass;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement login;

	public WebElement getTxtusr() {
		return txtusr;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getForgot() {
		return forgot;
	}

	public WebElement getId() {
		return id;
	}

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgot;

	@FindBy(id = "identify_email")
	private WebElement id;
	
	@FindBy(id="did_submit")
	private WebElement cli;
	public WebElement getCli() {
		return cli;
	}
	
	
	
}
