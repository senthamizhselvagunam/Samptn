
package org.pojocls;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojocls2 extends Baseclass {
	public Pojocls2() {
		PageFactory.initElements(driver, this);
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
