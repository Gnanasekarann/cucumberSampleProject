package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login2")
	private WebElement loginbtn;

	@FindBy(id="loginusername")
	private WebElement username;

	@FindBy(id="loginpassword")
	private WebElement password;
	
	@FindBy(xpath="//button[@onClick='logIn()']")
	private WebElement btnlogin;

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
}
