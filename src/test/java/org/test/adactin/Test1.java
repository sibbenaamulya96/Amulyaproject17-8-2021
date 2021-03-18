package org.test.adactin;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups="rerun")
	public void tc1() {
	System.out.println("tc1");
	}
	@Test(groups="retesting")
	public void tc2() {
	System.out.println("tc2");
	}
	@Test(groups="smoke")
	public void tc3() {
	System.out.println("tc3");
	}
}
