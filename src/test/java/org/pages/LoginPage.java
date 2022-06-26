package org.pages;

import org.LibGlobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	private WebElement movetoSigin;

	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement btnSignin;
	
	@FindBy(id="nav-logobar-greeting")
	private WebElement btnSignin2;
	
	@FindBy(name="emailLogin")
	private WebElement txtLogin;

	public WebElement getMovetoSigin() {
		return movetoSigin;
	}

	public WebElement getBtnSignin() {
		return btnSignin;
	}

	public WebElement getBtnSignin2() {
		return btnSignin2;
	}

	public WebElement getBtnLogin() {
		return txtLogin;
	}
	
	public void LoginToAmazon(String email) {
		//moveToElement(getMovetoSigin());
		getBtnSignin().click();
		sendKeys(getBtnLogin(), email);
	}
	}
