package org.test.hcl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DataDrivenWithPom extends BaseClass{
	public DataDrivenWithPom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
private WebElement txtEmail;
	@FindBys({
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@id='pass']")
	})
private WebElement txtPass;
	@FindAll({
		@FindBy(id="loginbutton"),
		@FindBy(name="login")
	})
private WebElement btnLogin;
public WebElement getTxtEmail() {
	return txtEmail;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getBtnLogin() {
	return btnLogin;
}

}
