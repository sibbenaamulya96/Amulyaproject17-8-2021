package org.test.hcl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	static WebDriver driver;

	

		@BeforeClass
		public static void beforeClass() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMULYA\\eclipse-workspace\\Selenium11am\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		@AfterClass
		public static void afterClass() {
System.out.println("AfterClass");
		}
		@Before
		public  void beforemethod() {
System.out.println("beforemethod");
		}
		@After
		public  void afterMethod() {
System.out.println("afterMethod");
		}
		@Test
		public void tc1() {
System.out.println("tc1");
		}
		@Test
		public void tc2() {
System.out.println("tc2");
		}
	
		@Test
		public void tc3() {
System.out.println("tc3");
		}
		
		
	

}

