package org.test.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
public static void browserConfig() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMULYA\\eclipse-workspace\\Selenium11am\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	

}
public static void openBrowser(String url) {
driver.get(url);
}
public static void maximize() {
driver.manage().window().maximize();
}
public static void type(WebElement element,String value) {
	element.sendKeys(value);

}
public static void click(WebElement element) {
element.click();		
	}
public static void close() {
driver.close();
}

public static void quit() {
driver.quit();
}

}
