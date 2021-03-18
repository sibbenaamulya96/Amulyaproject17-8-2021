package org.test.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookLogin extends BaseClass{
	public static void main(String[] args) {
		browserConfig();
		openBrowser("https://www.facebook.com/");
		maximize() ;
		WebElement txtUsername = driver.findElement(By.id("email"));
		type(txtUsername, "xhajbxh");
		WebElement txtPass = driver.findElement(By.id("pass"));
		type(txtPass, "jgvgj");
		WebElement btnLogin = driver.findElement(By.name("login"));
		click(btnLogin);
	}

	

}
